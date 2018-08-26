class ContinueEtiqueta {
	public static void main (String [] a){
		int x = 0;
		fuera:
		do {
			do {
				x++;
				System.out.println("Inicia if");
				if (x>2) {
					continue fuera;
				}
				System.out.println("Termina if, x = " + x);
			} while (x<3);
			x++;
			System.out.println("Termina do-while interno, x = " + x);
		} while (x<5);
		System.out.println("Termina do while externo");
	}
}
