package juegos.Escoba;

//import java.awt.Image;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;


public class Firework  extends Canvas implements Runnable
{    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int AnimationSpeed = 12; /*** Chance of different rocket style. Rocket sytle changes if Math.random() * 100 < RocketStyleVariability.   */
    public int RocketStyleVariability = 10;  /** * Maximum number of rockets.  */
    public int MaxRocketNumber = 12;
    public int MaxRocketExplosionEnergy = 850;
    public int MaxRocketPatchNumber = 90;
    public int MaxRocketPatchLength = 68;

    public int Gravity = 400;

    transient private Rocket rocket[];

    transient private Thread launcher = null;
    transient private boolean suspend = false;
    
    public Firework() {                 
        super();                        
    }
    public void addNotify() {
        super.addNotify();
        createRockets();     
        launcher = new Thread(this);
        launcher.start();
    }
    public synchronized void removeNotify() {
        if (launcher != null) {
            launcher.stop();
            launcher = null;
        }
        super.removeNotify();
    }
    
    public synchronized void reshape(int x, int y, int width, int height) {
        super.reshape(x, y, width, height);
    }

    private void createRockets() {

        Rocket tempRocket[] = new Rocket[MaxRocketNumber];

        for (int i = 0; i < MaxRocketNumber; i++)
            tempRocket[i] = new Rocket(getSize().width, getSize().height, Gravity);

        rocket = tempRocket;
    }

    public void run() {
        int i,

        e = (int)(Math.random() * MaxRocketExplosionEnergy * 3 /4) +  MaxRocketExplosionEnergy /4 + 1,
        p = (int)(Math.random() * MaxRocketPatchNumber * 3 / 4) +   MaxRocketPatchNumber /4 + 1,
        l = (int)(Math.random() * MaxRocketPatchLength * 3 / 4 ) +   MaxRocketPatchLength /4 + 1;

        long s = (long)(Math.random() * 10000);
        boolean sleep;        

        while (true) {            
            if(suspend){
                suspend = false;
                launcher.suspend();
            }         
            Graphics g = getGraphics();
            try { Thread.sleep(100 / AnimationSpeed);  } catch(InterruptedException x) {  }

            sleep = true;

           for (i = 0; i < MaxRocketNumber; i++)    sleep = sleep && rocket[i].sleep;

           if (sleep && Math.random() * 100 < RocketStyleVariability) {
                    e = (int)(Math.random() * MaxRocketExplosionEnergy * 3 /4) +  MaxRocketExplosionEnergy /4 + 1;
                    p = (int)(Math.random() * MaxRocketPatchNumber * 3 /4) +   MaxRocketPatchNumber /4 + 1;
                    l = (int)(Math.random() * MaxRocketPatchLength * 3 / 4) +   MaxRocketPatchLength /4 + 1;
                    s = (long)(Math.random() * 10000);
           }

           for (i = 0; i < MaxRocketNumber; ++i) {
                    Rocket r = rocket[i];
                    if (r.sleep && Math.random() * MaxRocketNumber * l < 1) {
                        r.init(e, p, l, s);
                        r.start();
                    }
                    r.show(g);
           }
           try { Thread.sleep(100 / AnimationSpeed);  } catch(InterruptedException x) {  }
        }
    }
    public void freezeRockets() {
        suspend = true;
    }

    public void unfreezeRockets() {
        suspend = false;
        launcher.resume();
    }
    public void paint(Graphics g) {        
        g.setColor(Color.black);
        g.fillRect(0, 0, getSize().width + 1,getSize().height + 1);
    }
}


class Rocket {
    public boolean sleep = true;

    private int energy,patch,length,
             mx,my,
             gravity,
             ox,oy,
             vx[],vy[],
             x,y,
             red,blue,green,
             t;
    private Random random;

    public Rocket(int a, int b, int g) {
        mx = a;
        my = b;
        gravity = g;
    }

    public void init(int e, int p, int l, long seed) {
        int i;

        energy = e;
        patch = p;
        length = l;

        random = new Random(seed);

        vx = new int[patch];
        vy = new int[patch];

        red = (int)(random.nextDouble() * 128 ) + 128;
        blue = (int)(random.nextDouble() *128)  + 128;
        green = (int)(random.nextDouble() *128) + 128;

        ox = (int)(Math.random()* mx /2) + mx /4;
        oy = (int)(Math.random()* my /2) + my /4;

        for(i = 0; i < patch; ++i) {
            vx[i] = (int)(Math.random() * energy) - energy /1;
            vy[i] = (int)(Math.random() * energy * 7 / 8) - energy /8;
        }
    }

    public void start() {
        t = 0;
        sleep = false;
    }

    public void show(Graphics g) {
        if (!sleep) {
            if (t < length) {
                int i, c;
                double s;
                Color color;

                c = (int)(random.nextDouble() *64) - 32 + red;

                if (c >= 0 && c < 256)
                    red = c;

                c = (int)(random.nextDouble() * 64) - 32 + blue;

                if (c >= 0 && c < 256)
                    blue = c;

                c = (int)(random.nextDouble() * 64)  - 32 + green;

                if (c >= 0 && c < 256)
                    green = c;

                color = new Color(red, blue, green);

                for (i = 0; i < patch; ++i) {
                    s = (double)t / 100;
                    x = (int)(vx[i] * s);
                    y = (int)(vy[i] * s - gravity * s * s);

                    g.setColor(color);
                    g.drawLine(ox + x, oy - y, ox + x, oy - y);

                    if (t >= (length >>1)) {
                        for (int j = 0; j < 2; ++j)
                        {
                            s = (double)((t - length /2) *2 + j) / 100;
                            x = (int)(vx[i] * s);
                            y = (int)(vy[i] * s - gravity * s * s);

                            g.setColor(Color.black);
                            g.drawLine(ox + x, oy - y, ox + x, oy - y);
                        }
                    }
                }

                ++t;

            } else
                sleep = true;

        }
    }
}

