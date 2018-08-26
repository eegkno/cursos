public class EjThreadDeath implements Runnable {

	public void run() {
		try {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.println("IteraciOn " + (i+1) + " de " + Thread.currentThread().getName());
				Thread.currentThread().stop();
			}
		} catch(ThreadDeath td) {
			System.out.println("Hilo muerto");
		}
		System.out.println("Termina el " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		new Thread(new EjConRunnable(), "Primer hilo").start();
		new Thread(new EjConRunnable(), "Segundo Hilo").start();
		System.out.println("Termina el hilo principal");
	}
}
