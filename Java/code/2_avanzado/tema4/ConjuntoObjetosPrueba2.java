public class ConjuntoObjetosPrueba2 {

     public static void main (String [] args) {
	ConjuntoObjetos pila = new ConjuntoObjetos(5);
	for (int i = 0 ; i < pila.arreglo.length ; i++){
		String txt = "Objeto " + i;
		pila.setObject(txt);
	}
	ConjuntoObjetos.Enumerador enumerador = pila.new Enumerador();
	while(enumerador.hasMoreElements()){
		String txt = (String) enumerador.nextElement();
		System.out.println(txt);
	}
     }
}
