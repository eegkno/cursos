class Empleado {
	String nombre;
	int numEmpleado , sueldo;
	static private int contador = 0;

	Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		numEmpleado = ++contador;
	}

	public void aumentarSueldo(int porcentaje) {
		sueldo += (int)(sueldo * porcentaje / 100);
	}
	public String toString() {
		return "Num. empleado " + numEmpleado + " Nombre: " + nombre + " Sueldo: " + sueldo;
	}
}
