class Ejecutivo2 extends Empleado {
	int presupuesto;

	void asignarPresupuesto(int p) {
		presupuesto = p;
	}

	public String toString() {
		String s = super.toString();
		s = s + " Presupuesto: " + presupuesto;
		return s;
	}
}
