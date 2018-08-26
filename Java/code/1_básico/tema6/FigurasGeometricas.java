import figs.Triangulo;

public class FigurasGeometricas {

	public static void main (String [] args){
		// Se inicializa la instancia ti con todos sus valores
		Triangulo t = new Triangulo();
		t.ladoA = 5;
		t.ladoB = 6;
		t.base = 6;
		t.altura = 4;

		// Se imprimen los valores de Area y perImetro de la instancia
		System.out.println("El Area del triAngulo isOsceles es: " + t.area());
		System.out.println("El perImetro del triAngulo isOsceles es: " + t.perimetro());
		t.hola();
	}
}
