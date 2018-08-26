import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LeerTecladoCompleto {
    public static void main (String [] leer){
        String texto = "";
        try{
	BufferedReader br;
	br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Escribir texto:");
	texto = br.readLine();
	System.out.println("\n\nEl texto separado por espacios es:");
	StringTokenizer st = new StringTokenizer(texto);
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
	br.readLine();
	System.out.println("\n\nEl texto completo es:");
	System.out.println(texto);

	FileWriter fw = new FileWriter("archivo.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter salida = new PrintWriter(bw);
	salida.println(texto);
	salida.close();
	System.out.println("\n\nEl texto se guardó en archivo.txt");
	} catch (IOException ioe){
	System.out.println("\n\nError al abrir o guardar el archivo:");
	ioe.printStackTrace();
        } catch (Exception e){ 
	System.out.println("\n\nError al leer de teclado:");
	e.printStackTrace();
        }
    }
}
