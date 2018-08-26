import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ventana {
   public static void main(String [] args) {
       JFrame marco = new JFrame("Mi Ventana");
       Container contenedor = marco.getContentPane();
       contenedor.setLayout(new FlowLayout());
       JButton si = new JButton("SI");
       JButton no = new JButton("NO");
       JLabel etiqueta = new JLabel("Nombre");
       contenedor.add(etiqueta);
       contenedor.add(si);
       contenedor.add(no);
       marco.pack();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
}
