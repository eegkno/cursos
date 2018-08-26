public class MainSleep {
	public static void main (String [] args) {
		EjSleep es = new EjSleep();
		Thread uno = new Thread(es);
		uno.setName("Alfredo");
		Thread dos = new Thread(es);
		dos.setName("Lucy");
		Thread tres = new Thread(es);
		tres.setName("Rogelio");
		uno.start();
		dos.start();
		tres.start();
	}
}
