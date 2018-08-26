class ExternaMiembro {
	private int x = 7;
	public void crearInterna () {
		InternaMiembro in = new InternaMiembro();
		in.verExterna();
	}

	class InternaMiembro {
		int x = 3;
		public void verExterna() {
			System.out.println("X externa: " + ExternaMiembro.this.x);
			System.out.println("X interna: " + x);
			System.out.println("Referencia a clase interna: " + this);
			System.out.println("Referencia a clase externa: " + ExternaMiembro.this);
		}
	}

	public static void main (String[] args) {
		ExternaMiembro.InternaMiembro interna = new ExternaMiembro().new InternaMiembro();
		interna.verExterna();
	}
}
