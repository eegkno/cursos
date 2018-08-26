import java.io.*;

class SuperNoSerial {
	public static void main(String [] args) {
		Perro2 p = new Perro2(35, "Fido");
		System.out.println("Antes: " + p.nombre + " "+ p.peso);
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			p = (Perro2) ois.readObject();
			ois.close();
			System.out.println("after: " + p.nombre + " "+ p.peso);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
