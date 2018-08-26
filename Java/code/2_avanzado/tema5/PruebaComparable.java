import java.util.TreeSet;

public class PruebaComparable {
	public static void main (String [] args) {
		TreeSet grupo = new TreeSet();
		grupo.add(new PersonaComparable("Eduardo",18));
		grupo.add(new PersonaComparable("Jaime",19));
		grupo.add(new PersonaComparable("Alan",17));
		grupo.add(new PersonaComparable("Samuel",18));
		grupo.add(new PersonaComparable("adriana",18));
		System.out.println(grupo);
	}
}
