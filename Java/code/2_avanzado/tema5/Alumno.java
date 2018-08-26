public class Alumno {
	String nombre;
	int numCuenta;

	Alumno (String nombre, int numCuenta){
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}

	public String toString(){
		return nombre + "-" + numCuenta;
	}
}
