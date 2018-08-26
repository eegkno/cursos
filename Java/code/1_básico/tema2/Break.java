class Break {
	public static void main (String [] a){
		int x = 0, y = 0;
		do {
			System.out.println("Inicia do-while interno, x = " + x);
			do {
				x++;
				System.out.println("Inicia if");
				if (x>2) {
					break;
				}
				System.out.println("Termina if, x = " + x);
			} while (x<3);
			y++;
			System.out.println("Termina do-while interno, x = " + x + ", y = "+ y);
		} while (y<5);
		System.out.println("Termina do-while externo");
	}
}
