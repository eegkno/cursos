import java.io.*;
public class SerializarPerro {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		Perro p = new Perro(c, 8);
		System.out.println("Guardar: tamaNo del collar " + p.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);
			os.close();
		} catch (Exception e) {
			System.out.println("Error al serializar");
			e.printStackTrace();
			System.out.println("------------------------------------------");
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			p = (Perro) ois.readObject();
			ois.close();
			System.out.println("Dato recuperado: tamaNo del collar " + p.getCollar().getCollarSize());
		} catch (Exception e) {
			System.out.println("Error al hidratar");
			e.printStackTrace();
			System.out.println("------------------------------------------");
		}
	}
}

