import java.util.Random;

public class Matriz {
	public static void main(String[ ] args) {
		Random generador = new Random();

		// Se crea un arreglo bidimensional de 3x3 (matriz)
		int[][] arreglo = new int[3][3];

		int[] suma = new int[3];

		int sumaTotal = 0;
		for(int i=0; i<arreglo.length ; i++) {
			for(int j=0; j<arreglo[i].length ; j++) {
				arreglo[i][j] = generador.nextInt(101);
			}
		}
		System.out.println("Contenido de la matriz");
		for(int i=0; i<arreglo.length ; i++) {
			for(int j=0; j<arreglo[i].length ; j++) {
				suma[i] = suma[i] + arreglo[i][j];
				sumaTotal = sumaTotal + arreglo[i][j];
				System.out.print(arreglo[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Se imprime la suma de los renglones
		for(int i=0; i<suma.length ; i++){
			System.out.println("La suma del renglOn " + (i+1) + " es: " +suma[i]);
		}
		System.out.println("La suma total de los elementos es: " + sumaTotal);
	}
}
