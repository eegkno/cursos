public class Triangulo extends PoligonoRegular {
	float ladoA, ladoB, ladoC;
	float puntoA, puntoB, puntoC;
	float base, altura;
	int alfa, beta, gama;
	public float area(){
		return (base * altura)/2;
	}
	public float perimetro(){
		return 0;
	}
}
