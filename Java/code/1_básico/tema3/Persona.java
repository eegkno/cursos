public class Persona {
	String nombre;
	int edad;

	// Constructor no-args
	Persona (){}

	// Constructor que asigna nombre y edad
	Persona (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	void mostrarInfo(){
		System.out.print("Nombre = " + this.nombre);
		System.out.println(" edad = " + this.edad);
	}

	public static void main (String [] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Juan";
		persona1.edad = 25;
		Persona persona2 = new Persona("Luis",30);
		persona1.mostrarInfo();
		persona2.mostrarInfo();
	}
}
