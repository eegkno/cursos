public class ClaseInternaAnonima {
	Object arreglo[];
	int cima = 0;
	ClaseInternaAnonima(int tam){
		arreglo = new Object[tam];
	}
	public void setObject(Object ob){
		arreglo[cima++] = ob;
	}
	public Object getObject(){
		return arreglo[--cima];
	}
	public boolean vaciar(){
		return cima == 0;
	}
	// metodo con clase interna anonima
	public java.util.Enumeration elementos() {
	    return new java.util.Enumeration() {
	    	int cont = cima;
	    	public boolean hasMoreElements(){
			return cont > 0;
	    	}
	    	public Object nextElement(){
	        		if (cont == 0) {
				throw new 
				java.util.NoSuchElementException("Error");
	        		}
  	        		return arreglo[--cont];
	    	}
	    }; // Fin de la clase (una sola línea de código)
	} // Fin del metodo que implementa clase interna anonima
}

