import java.io.*;

class Gato implements Serializable {
}

public class SerializaGato {
	public static void main(String[] args) {
		Gato g = new Gato();
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(g);
			os.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			g = (Gato) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

