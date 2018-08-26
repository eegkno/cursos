public class ConjuntoObjetosPrueba {
	public static void main (String [] args){
		ConjuntoObjetos pila = new ConjuntoObjetos(5);

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
