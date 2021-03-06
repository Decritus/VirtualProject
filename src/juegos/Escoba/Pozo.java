package juegos.Escoba;

public class Pozo extends Vector{
    static final int N = 40;
    private int posx, posy;
    
    public Pozo(int x, int y){
        super(N);    
        posx = x; posy = y;
    }
    public int getPosX(){
        return posx;
    }
    public int getPosY(){
        return posy;
    }
    public void insertarCartas(Carta[] cart){
        int n = 0;
        for(int i = numCartas; i<N; i++){
            if(n == cart.length) break;
            else if(cart[n]!= null && cart[n].num>0){
                cartas[numCartas].copiar(cart[n]);
                n++;
                numCartas++;
            }
        }
    }
    public int getCantCartas(){
        return numCartas;
    }
    public int getCantOros(){
        int cont = 0;
        for(int i = 0; i<numCartas;i++){
            if(cartas[i].palo == "oro")
                cont++;
        }
        return cont;
    }
    
    public boolean esta7oro(){
        if(super.esta7Oro()>=0) return true;
        else return false;
    }
    public int getCant(int numcarta){
        int cont = 0;
         for(int i = 0; i<numCartas;i++){
            if(cartas[i].num == numcarta)
                cont++;
        }
        return cont;
    }

}