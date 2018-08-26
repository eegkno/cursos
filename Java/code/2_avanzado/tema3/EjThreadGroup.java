public class EjThreadGroup {

    public static void listarHilos(ThreadGroup grupoActual) {
        int numHilos;
        Thread [] listaDeHilos;

        numHilos = grupoActual.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoActual.enumerate(listaDeHilos);
	System.out.println("Numero de hilos = " + numHilos);
        for (int i = 0 ; i < numHilos ; i++) {
            System.out.println("Hilo " + (i+1) + " = " + listaDeHilos[i].getName());
        }
    }

    public static void main(String[] args) {

        ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");
        Thread hilo1 = new Thread(grupoHilos, "Hilo 1 con prioridad mAxima");
        Thread hilo2 = new Thread(grupoHilos, "Hilo 2 con prioridad normal");
        Thread hilo3 = new Thread(grupoHilos, "Hilo 3 con prioridad normal");
        Thread hilo4 = new Thread(grupoHilos, "Hilo 4 con prioridad normal");
        Thread hilo5 = new Thread(grupoHilos, "Hilo 5 con prioridad normal");

        // Se asigna la prioridad mAxima al hilo
        hilo1.setPriority(Thread.MAX_PRIORITY);

        // Se asigna la prioridad normal al grupo
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);

        System.out.println("Máxima prioridad del grupo = " + grupoHilos.getMaxPriority());
        System.out.println("Prioridad del Thread = " + hilo1.getPriority());
        System.out.println("Prioridad del Thread = " + hilo2.getPriority());
        System.out.println("Prioridad del Thread = " + hilo3.getPriority());
        System.out.println("Prioridad del Thread = " + hilo4.getPriority());
        System.out.println("Prioridad del Thread = " + hilo5.getPriority());	

	hilo1.start();
	hilo2.start();
	hilo3.start();
	hilo4.start();
	hilo5.start();

	listarHilos(grupoHilos);
    }
}
