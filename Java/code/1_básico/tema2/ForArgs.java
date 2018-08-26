public class ForArgs{
   public static void main(String args[]){
      if ( args.length == 0 ){
         System.out.println("ERROR!, se deben proporcionar argumentos al ejecutar el programa!");
         System.out.println("Uso: java Argumentos ARG1 ARG2 ... ARGn");
      }

      for ( int i = 0 ; i < args.length ; i++ ){
         System.out.println("Parametro " + (i+1) + ": " + args[i]);
      }
   }
}

