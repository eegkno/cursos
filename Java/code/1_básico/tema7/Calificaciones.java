public class Calificaciones {

    public static void main(String[] args) {
	float suma=0f;

	//Declaracion e inicialización del arreglo “calificaciones”
	float[ ] calificaciones= {7.0f, 10.0f, 6.5f, 8.6f, 9.4f, 9.1f, 5.3f, 7.8f, 8.4f, 10.0f};

	for(int i = 0 ; i < calificaciones.length ; i++) {
		suma=suma+calificaciones[i];
	}

	System.out.println("El promedio de calificaciones es: " + suma/calificaciones.length);
    }
}
