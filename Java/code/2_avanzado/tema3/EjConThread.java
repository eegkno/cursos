public class EjConThread extends Thread {

	public EjConThread (String nombre){
		super(nombre);
	}

	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("IteraciOn " + (i+1) + " de " + getName());
		}
		System.out.println("Termina el " + getName());
	}
	
	public static void main(String[] args) {
		new EjConThread("Primer hilo").start();
		new EjConThread("Segundo Hilo").start();
		System.out.println("Termina el hilo principal");
	}
}
