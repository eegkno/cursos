import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdaptadorVentana extends WindowAdapter {
	JFrame ventana;
	public AdaptadorVentana(){
		ventana = new JFrame("Eventos en ventana");
        	ventana.setSize(640, 480);
        	ventana.setVisible(true);
        	ventana.addWindowListener(this);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}

        public void windowClosing(WindowEvent e){
            System.out.println("Cerrando ventana");
        }
 
	public static void main(String[] args){
        	new AdaptadorVentana();
    	}

}
