public class ClaseExterna {
    static int i = 5;
    void metodoClaseExterna() {
	System.out.println("Dentro de metodo de la clase externa");
    }

    // Inicia la clase interna estática
    public static class InternaEstatica {
	public static void main(String args[]) { 
		System.out.println("Dentro de la clase interna " + i); 
		ClaseExterna cie = new ClaseExterna(); 
		cie.metodoClaseExterna();
	}
    } // Fin de la clase interna estática
} // Fin de la clase Externa
