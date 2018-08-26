public class MiExcepcion {
	public MiExcepcion() {
	}
	public void revisar (String s) throws ExcepcionPropia {
		System.out.println(s);
		throw new ExcepcionPropia ("Error:"+s);
	}
	public void revisar2 (String s) throws ExcepcionPropia {
		revisar (s);
	}
	public static void main(String[] a){
		MiExcepcion me = new MiExcepcion();
		try{
			me.revisar2("¿Se puede?");
		} catch(ExcepcionPropia ep) {
			ep.printStackTrace();
			System.out.println("No se pudo");
		}
	}
}

