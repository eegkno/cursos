import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjActionListener {
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
      JButton boton = new JButton("Aceptar");
      // agragar botones al panel
      add(boton);
      // crear las acciones para los botones
      AccionDelBoton accion = new AccionDelBoton();
      // asociar la accion al boton
      boton.addActionListener(accion);
   }


   /**
      Un "action listener" que define la accion del boton.
   */
   private class AccionDelBoton implements ActionListener {
      /* Accion a realizar */
      public void actionPerformed(ActionEvent event) {
         System.out.println("Clic en el botOn");
      }
   }
}
