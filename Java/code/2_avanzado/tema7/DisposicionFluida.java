import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisposicionFluida {

public static void main(String [] args) {
       JFrame marco = new JFrame("Disposición fluida");
       Container contenedor = marco.getContentPane();
       contenedor.setLayout(new FlowLayout());
       JButton b1 = new JButton("1");
       JButton b2 = new JButton("2");
       JButton b3 = new JButton("2");
       JButton b4 = new JButton("2");
       JButton b5 = new JButton("2");
       JButton b6 = new JButton("2");
       JButton b7 = new JButton("7");
       JButton b8 = new JButton("8");
       JLabel etiqueta = new JLabel("Nombre");
       contenedor.add(etiqueta);
       contenedor.add(b1);
       contenedor.add(b2);
       contenedor.add(b3);
       contenedor.add(b4);
       contenedor.add(b5);
       contenedor.add(b6);
       contenedor.add(b7);
       contenedor.add(b8);
       marco.pack();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
}
