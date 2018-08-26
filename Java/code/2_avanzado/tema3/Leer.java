class Leer extends Thread {
	Calcular c;
	public Leer(Calcular calc) {
		c = calc;
	}
	public void run() {
		synchronized(c) {
			try {
				System.out.println("Esperando los cAlculos...");
				c.wait();
			} catch (InterruptedException e) {}
			System.out.println("Total: " + c.total);
		}
	}

	public static void main(String [] args) {
		Calcular calcular = new Calcular();
		new Leer(calcular).start();
		new Leer(calcular).start();
		new Leer(calcular).start();
		calcular.start();
	}
}
