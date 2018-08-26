public class ConjuntoObjetos {
	Object arreglo[];
	int cima = 0;	
	ConjuntoObjetos(int tam){
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

	// clase interna miembro
	class Enumerador implements java.util.Enumeration {
		int cont = cima;
		public boolean hasMoreElements() {
			return cont > 0;
		}
		public Object nextElement() {
			if (cont == 0) {
				throw new java.util.NoSuchElementException("Error");
			}
    			return arreglo[--cont];
		}
    	} // Fin de la clase interna

    	public java.util.Enumeration elementos(){
		return new Enumerador();
    	}
}

