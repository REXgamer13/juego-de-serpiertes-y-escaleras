

public class Casilla {
    private String tipoCasilla;
    private int movimientoN;
    private int posGraficaX;
    private int posGraficaY;
 
    
  //se empiezan las casillas con valor 0
  public Casilla() {
        this.movimientoN = 0;
        this.posGraficaX = 0;
        this.posGraficaY = 0;
    }
  public int getPosGraficaX() {
        return posGraficaX;
   }

  public void setPosGraficaX(int posGraficaX) {
    this.posGraficaX = posGraficaX;
  }

  public int getPosGraficaY() {
    return posGraficaY;
  }

  public void setPosGraficaY(int posGraficaY) {
    this.posGraficaY = posGraficaY;
 }
    
   
  public String getTipoCasilla() {
      return tipoCasilla;
  }

  public void setTipoCasilla(String tipoCasilla) {
      this.tipoCasilla = tipoCasilla;
  }

  public int getMovimientoN() {
      return movimientoN;
  }

  public void setMovimientoN(int movimientoN) {
     this.movimientoN = movimientoN;
  }
 
}