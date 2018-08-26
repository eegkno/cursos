class Ejecutivo extends Empleado {
	int presupuesto;

	Ejecutivo(String nombre, int sueldo) {
		super(nombre,sueldo);
	}

	void asignarPresupuesto(int p) {
		presupuesto = p;
	}

	public String toString(){
		return super.toString() + " presupuesto = " + presupuesto + ".";
	}

	public static void main(String [] args) {
		// Se crea una referencia del tipo Empleado
		Empleado emp;
		// Se instancía la referencia tipo empleado como Ejecutivo
		emp = new Ejecutivo("Máximo Dueño" , 2000);
		// Se cambia la referencia de tipo
		Ejecutivo ej = (Ejecutivo)emp;
		// Se accede al método de la clase ejecutivo
		ej.asignarPresupuesto(1500);
		System.out.println(ej.toString());
	}
}
