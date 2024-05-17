public class Jugador {
    private String nombre;
    private Object colorFicha;
    private int casillaActual;
    private int turnoPerdido;

    public Jugador(){
        this.casillaActual = 1;
        this.turnoPerdido =0;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getColorFicha() {
        return colorFicha;
    }

    public void setColorFicha(Object colorFicha) {
        this.colorFicha = colorFicha;
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
    }

    public int getTurnoPerdido() {
        return turnoPerdido;
    }

    public void setTurnoPerdido(int turnoPerdido) {
        this.turnoPerdido = turnoPerdido;
    }
    
}