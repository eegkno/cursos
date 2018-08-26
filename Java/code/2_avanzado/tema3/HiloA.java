class HiloA {
 	public static void main(String [] args) {
 		HiloB b = new HiloB();
 		b.start();
 		synchronized(b) {
			try {
 				System.out.println("Esperando que el hilo b termine su ejecuciOn...");
 				b.wait();
 			} catch (InterruptedException e) {}
 			System.out.println("Total: " + b.total);
 		}
 	}
}
