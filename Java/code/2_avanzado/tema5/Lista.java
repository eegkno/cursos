import java.util.*;

public class Lista {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("uno");
		l.add("segundo");
		l.add("3ro");
		l.add(new Integer(4));
		l.add(new Float(5.0F));
		l.add("segundo"); // duplicado
		l.add(new Integer(4)); // duplicado 
		System.out.println(l);
	}
}
