
package calculadora.tela2;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Tela2 extends JFrame{
public void Painel(){

 super.getContentPane().setLayout(null);
        super.getContentPane().setBackground(new Color(28, 28, 28));
        super.setSize(500, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocation(200, 200);
}
   
}
