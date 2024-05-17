import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Presentacion{
    private String nivelDificultad;
    private Object numeroJugadores;
    private Object numeroCasillas;
    public Presentacion(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("presentacion.png"));
        JLabel presentacion = new JLabel(imagen);
        presentacion.setSize(500, 500);
        presentacion.setVisible(true);
        Object seleccion = JOptionPane.showInputDialog(null,"Elija un dificultad","Selector de dificultad",
        JOptionPane.QUESTION_MESSAGE,imagen,
        new Object[] { "Nivel facil", "Nivel avanzado" },"Nivel avanzado");
        while(seleccion == null){
            JOptionPane.showMessageDialog(null,"Por favor escoja una dificultad");
             seleccion = JOptionPane.showInputDialog(null,"Elija un dificultad","Selector de dificultad",
        JOptionPane.QUESTION_MESSAGE,imagen,
        new Object[] { "Nivel facil", "Nivel avanzado" },"Nivel avanzado");
            
        }
        this.nivelDificultad= seleccion.toString();
    }
    public String getNivelDificultad() {
        return nivelDificultad;
    }
    public Object getNumeroCasillas() {
        return numeroCasillas;
    }
    public Object getNumeroJugadores() {
        return numeroJugadores;
    }
    public void pedirDatosUsuario(){
        if (nivelDificultad.equals("Nivel facil"))
        {
             (this.numeroCasillas) = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de Casillas",   ""
             + "Casillas",   JOptionPane.QUESTION_MESSAGE,null,
            new Object[] {100, 169},100);

            while(numeroCasillas == null){
                JOptionPane.showMessageDialog(null,"Por favor escoja un numero de casillas");
                numeroCasillas = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de Casillas",  
                        "Casillas",   JOptionPane.QUESTION_MESSAGE,null,
                new Object[] {100, 169},100);
            }
        }
        if (nivelDificultad.equals("Nivel avanzado"))
        {
             numeroCasillas = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de Casillas",   
                     "Casillas",   JOptionPane.QUESTION_MESSAGE,null,
            new Object[] {255},255);

            while(numeroCasillas == null){
                JOptionPane.showMessageDialog(null,"Por favor escoja un numero de casillas");
                numeroCasillas = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de Casillas",  
                        "Casillas",   JOptionPane.QUESTION_MESSAGE,null,
                new Object[] {255},255);
            }
        }
        numeroJugadores = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de jugadores",   
                "Jugadores",   JOptionPane.QUESTION_MESSAGE,null,
        new Object[] { "contra computadora", 2, 3,4 },   "");
        while(numeroJugadores == null){
            JOptionPane.showMessageDialog(null,"Por favor escoja un numero de jugadores");
            numeroJugadores = JOptionPane.showInputDialog(null, "Seleccione el n\u00famero de jugadores",   
                    "Jugadores",   JOptionPane.QUESTION_MESSAGE,null,
            new Object[] { "contra computadora", 2, 3,4 },   "");
        }
        if (numeroJugadores.equals("contra computadora")){
            numeroJugadores = 1;
        }
    }
}