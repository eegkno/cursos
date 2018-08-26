public class DoWhile {
	public static void main (String [] args) {
	        int x = 0;
	        int y = 10;
	        System.out.println(“Ciclo while”);
	        while(x < y) {
		System.out.println(“x = “ + x++); 
	       } 
	      System.out.println("Segundo iterador"); 
	      do { 
		System.out.println("x = " + x--); 
	     } while ( x > 0 );
	}
}
