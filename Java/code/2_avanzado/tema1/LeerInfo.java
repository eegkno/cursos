import java.io.*;
public class LeerInfo {
	public static void main(String args[]) {
		try {
			RandomAccessFile raf = new RandomAccessFile("archivo.txt", "r");
			byte b[] = new byte[1000];
			raf.readFully(b, 0, 1000);
		} catch(FileNotFoundException e) {
			System.err.println("Archivo no encontrado");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			System.err.println("Error de entrada/salida");
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}
}
