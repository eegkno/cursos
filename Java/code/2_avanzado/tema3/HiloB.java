class HiloB extends Thread {
	int total;
	public void run() {
		synchronized(this) {
			System.out.println("Inicia B...");
 			for(int i=0;i<100;i++) {
 				total += i;
 			}
			System.out.println("TerminO B. Se procede a notificar.");
 			notify();
		}
	}
}
