public class IfElse {

        public static void main (String [] args) { 
	int a=45;
	int res = a<0 ? a*(-1) : a;
	if ( a%2 == 0 ){
                        System.out.println("El número " + a + " es un nUmero par\n");
                } else {
                        System.out.println("El número " + a + " es un nUmero impar\n");
                }
        }
}
