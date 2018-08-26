import java.io.Serializable;

class Perro2 extends Animal implements Serializable {
	String nombre;
	
	Perro2(int w, String n) {
		peso = w; // heredado
		nombre = n; // no heredado
	}
}
