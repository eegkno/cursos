package figs;

public class Triangulo extends Poligono {
	public float ladoA, ladoB, ladoC, puntoA, puntoB, puntoC;
	public float base, altura;
	public int alfa, beta, gama;
	
	public float area(){
		return (base * altura)/2;
	}
	
	public float perimetro(){
		return 0;
	}

}
