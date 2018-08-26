import javax.swing.JFrame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class EventoVentana implements WindowListener {
	JFrame ventana;
	public EventoVentana(){
		ventana = new JFrame("Eventos en ventana");
        	ventana.setSize(640, 480);
        	ventana.setVisible(true);
        	ventana.addWindowListener(this);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}

	public void windowActivated(WindowEvent e){
            System.out.println("Ventana activa");
        }
 
        public void windowClosed(WindowEvent e){
            System.out.println("Ventana cerrada");
        }
 
        public void windowClosing(WindowEvent e){
            System.out.println("Cerrando ventana");
            ventana.dispose();
        }
 
        public void windowDeactivated(WindowEvent e){
            System.out.println("Ventan desactivada");
        }
 
        public void windowDeiconified(WindowEvent e){
            System.out.println("Restaurar ventana");
        }
 
        public void windowIconified(WindowEvent e){
            System.out.println("Minimizar ventana");
        }
 
        public void windowOpened(WindowEvent e){
            System.out.println("Ventana abierta");
        }

	public static void main(String[] args){
        	new EventoVentana();
    	}

}
