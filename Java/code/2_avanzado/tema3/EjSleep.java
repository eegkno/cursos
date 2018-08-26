class EjSleep implements Runnable {
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Ejecutado por: " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) { }
		}
	}
}
