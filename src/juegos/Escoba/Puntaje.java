package juegos.Escoba;

public class Puntaje
{
    public int escobas;
    public int velos;
    public int setenta;
    public int mascartas;
    public int masoros;
    public int total;
    
    public Puntaje(){
        inicializar();
    }
    public void inicializar(){
        escobas = 0;
        velos = 0;
        setenta = 0;
        mascartas = 0;
        masoros = 0;
        total = 0;
    }
}