import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class Titulo extends JPanel {

    private JLabel J_titulo;
    private Border B_titulo, B_outside;
    public Titulo(){
        super();
        setLayout(new GridBagLayout());
        addWidgets();
    }
    private void addWidgets(){
        B_titulo = BorderFactory.createRaisedBevelBorder();
        J_titulo = new JLabel("Juego de Serpientes y Escaleras");
        B_outside = BorderFactory.createLineBorder(Color.DARK_GRAY, 5, false);
        B_titulo = BorderFactory.createCompoundBorder(B_outside, B_titulo);
        J_titulo.setHorizontalAlignment( SwingConstants.CENTER ); 
        J_titulo.setOpaque(true);
        J_titulo.setBackground(new Color(0,255,179));
        J_titulo.setForeground(new Color(0,0,0));
        J_titulo.setFont(new Font("Elephant", Font.PLAIN, 22));
        J_titulo.setBorder(B_titulo);
        GridBagConstraints c = new GridBagConstraints();
        c.gridheight = 300;
        c.gridwidth = 600;
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 500;
        c.ipady = 15;
        add(J_titulo,c);
    }
}
