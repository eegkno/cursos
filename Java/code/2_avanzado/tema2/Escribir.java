import java.io.*;
class Escribir {
	public static void main(String [] args) {
		try {
			File archivo = new File("archivo.txt");
			System.out.println(archivo.exists());
			boolean seCreo = archivo.createNewFile();
			System.out.println(seCreo);
			System.out.println(archivo.exists());
		} catch(IOException e) { }
	}
}

