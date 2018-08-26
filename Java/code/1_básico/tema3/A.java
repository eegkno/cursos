class A {
	public void metodoA(int a) {
		System.out.println(a);
	}
	public void metodoB(int b) {
		metodoA(b+5); // se invoca al metodoA
	}
	public static void main(String[ ] arg) {
		/* como los métodos no son estáticos se debe crear
		     una instancia de la clase */
		A a=new A(); a.metodoB(5);
	}
}
