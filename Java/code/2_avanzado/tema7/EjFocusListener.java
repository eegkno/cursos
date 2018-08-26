import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjFocusListener {  
   public static void main(String[] args) {
      MarcoBoton marco = new MarcoBoton();
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco.setVisible(true);
   }
}

class MarcoBoton extends JFrame {
   public static final int ANCHO_EN_PIXELS = 250;
   public static final int ALTO_EN_PIXELS = 70;

   public MarcoBoton() {
      setTitle("Prueba de eventos");
      setSize(ANCHO_EN_PIXELS, ALTO_EN_PIXELS);
      PanelBoton panel = new PanelBoton();
      add(panel);
   }
}

class PanelBoton extends JPanel {
   public PanelBoton() {

      // crear botones
      JButton aceptar = new JButton("Aceptar");
      JButton cancelar = new JButton("Cancelar");

      // agragar botones al panel
      add(aceptar);
      add(cancelar);

      // crear las acciones para los botones
      FocoDelBoton accionEnFoco = new FocoDelBoton();

      // asociar la accion al boton
      aceptar.addFocusListener(accionEnFoco);
   }

   /** Un "action listener" que define la accion del boton. */
   private class FocoDelBoton implements FocusListener {
      /* Accion a realizar en cuando en boton esta en foco */
      public void focusGained(FocusEvent  event) {
         System.out.println("Boton esta en foco ");
      }

      /* Accion a realizar en cuando en boton no esta en foco */
      public void focusLost(FocusEvent  event) {
         System.out.println("Boton perdio el foco ");
      }
   }
}

