public class ClaseInternaLocalPrueba {
	public static void main (String [] args){
		ClaseInternaLocal pila = new ClaseInternaLocal(5);

		for (int i = 0 ; i < pila.arreglo.length ; i++){
			String txt = "Objeto " + i;
			pila.setObject(txt);
		}

		java.util.Enumeration enumerador;
		enumerador = pila.elementos();
		
		while(enumerador.hasMoreElements()){
			String txt = (String) enumerador.nextElement();
			System.out.println(txt);
		}
	}
}
