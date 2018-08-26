public class Dias {
    public enum Dia {
    	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO 
    }
    Dia dia;
    
    public Dias(Dia dia) {
        this.dia = dia;
    }
    
    public void describeDia() {
        switch (dia) {
            case LUNES:
                System.out.println("Los lunes son feos.");
                break;
                    
            case VIERNES:
                System.out.println("Los viernes son esperados.");
                break;
                         
            case SABADO: case DOMINGO:
                System.out.println("El fin de semana es glorioso.");
                break;
                        
            default:
                System.out.println("Los otros dIas son equis.");
                break;
        }
    }
    
    public static void main(String[] args) {
        Dias primerDia = new Dias(Dia.LUNES);
        Dias tercerDia = new Dias(Dia.MIERCOLES);
        Dias quintoDia = new Dias(Dia.VIERNES);
        Dias sextoDia = new Dias(Dia.SABADO);
        Dias septimoDia = new Dias(Dia.DOMINGO);
        septimoDia.describeDia();
        quintoDia.describeDia();
        primerDia.describeDia();
        tercerDia.describeDia();
        sextoDia.describeDia();
	for (Dia d : Dia.values())
		System.out.println(d);
	int cont = 0;
	for (Dia d : Dia.values()) {
		cont++;
		System.out.println("Dia " + cont + ": " + d);
	}
    }
}
