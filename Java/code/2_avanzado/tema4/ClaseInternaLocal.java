public class ClaseInternaLocal {
	Object arreglo[];
	int cima = 0;
	ClaseInternaLocal(int tam){
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
	// metodo con clase interna local
    	java.util.Enumeration enumeradorPropio(final Object objetos[]) {
		class ClaseLocal implements java.util.Enumeration {
	     		int cont = 0;
	     		public boolean hasMoreElements(){
				return cont < objetos.length;
	     		}
	     		public Object nextElement(){
				if (cont == objetos.length) {
	  	     			throw new java.util.NoSuchElementException("Error");
				}
				return objetos[cont++];
			}
 		} // Fin de la clase Enumerador
		return new ClaseLocal();
	} // Fin del metodo que implementa clase interna local

	public java.util.Enumeration elementos(){
		return enumeradorPropio(arreglo);
	}
}
