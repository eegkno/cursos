// javadoc –d ruta -version -author –use NombreClase.java
import java.util.*;
     /** 
      * Clase que calcula el perímetro de un triángulo isósceles
      * @author Jorge A. Solano
      * @author jorge.a.solano@hotmail.com
      * @version 1
     */
public class Triangulo {

       /** Método que calcula el perímetro del triángulo isósceles
        * @params Ninguno
        * @return Valor del perímetro (tipo flotante)
        * @exception No se genera error alguno
        */ 
      public float perimetro () {
	return 2 * ladoA + ladoB;
      }
}
