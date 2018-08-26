import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class OtrosComponentes {

public static void main(String [] args) {
       JFrame marco = new JFrame("Mi primer ventana");
       Container contenedor = marco.getContentPane();
       contenedor.setLayout(new FlowLayout());
       // boton
       JButton b1 = new JButton("BotOn");
       // etiqueta
       JLabel etiqueta = new JLabel("Nombre");
       // campo texto
       JTextField campoTexto = new JTextField("Campo de texto");
       // caja de texto
       JTextArea areaTexto = new JTextArea("Area de texto");
       // Botones tipo radio
       JRadioButton[] botonesRadio = new JRadioButton[3];
       ButtonGroup grupo = new ButtonGroup();
       botonesRadio[0] = new JRadioButton("Opcion 1");
       botonesRadio[1] = new JRadioButton("Opcion 2");
       botonesRadio[2] = new JRadioButton("Opcion 3");
       for (int i = 0; i < 3; i++) {
          grupo.add(botonesRadio[i]);
       }
       // caja texto
       JCheckBox caja = new JCheckBox("Caja de selección");
       // Se agregan los componentes al contenedor
       contenedor.add(etiqueta);
       contenedor.add(b1);
       contenedor.add(campoTexto);
       contenedor.add(areaTexto);
       contenedor.add(caja);
       for (int i = 0; i < 3; i++) {
          contenedor.add(botonesRadio[i]);
       }
       marco.pack();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
}
