import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class PanelConScroll {

	public static void main(String [] args) {
		JFrame marco = new JFrame("Ej JScrollPanel");
		ImageIcon ii = new ImageIcon("dragon.jpg");
		JLabel etiqueta = new JLabel(ii);
		JScrollPane scrollPane = new JScrollPane(etiqueta);
		marco.getContentPane().add(scrollPane);
		marco.pack();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

