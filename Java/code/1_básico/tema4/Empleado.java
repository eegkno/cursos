class Empleado {
	String nombre;
	int numEmpleado , sueldo;
	public void aumentarSueldo(int porcentaje) {
		sueldo += (int)(sueldo * porcentaje / 100);
	}
	
	public String toString() {
		return "Num. Empleado " + numEmpleado + " Nombre: " + nombre + " Sueldo: " + sueldo;
	}
}
