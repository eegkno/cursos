public class PersonaComparable implements Comparable {
	String nombre;
	int edad;

	PersonaComparable (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/*public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getEdad(){
		return this.edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}*/

	public int compareTo(Object obj){
		return this.nombre.compareTo(((PersonaComparable)obj).nombre);
		//return this.edad-((PersonaComparable)obj).edad;
	}

	public String toString() {
		return nombre + ":" + edad + "";
	}
}
