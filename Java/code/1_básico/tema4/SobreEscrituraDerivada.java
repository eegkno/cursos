public class SobreEscrituraDerivada extends SobreEscrituraBase {
	int metodo(){
		System.out.println(super.metodo());
		return 3;
	}

	public static void main (String [] ok) {
		SobreEscrituraDerivada sed = new SobreEscrituraDerivada();
		System.out.println(sed.metodo());
	}
}
