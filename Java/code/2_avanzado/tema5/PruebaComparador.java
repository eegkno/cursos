import java.util.Comparator;
import java.util.TreeSet;

public class PruebaComparador {
	public static void main (String [] args) {
		Comparator c = new ComparadorNombreAlumno();
		TreeSet grupo = new TreeSet(c);
		grupo.add(new Alumno("Eduardo",3018));
		grupo.add(new Alumno("Jaime",3019));
		grupo.add(new Alumno("Alan",3017));
		grupo.add(new Alumno("Samuel",3022));
		grupo.add(new Alumno("adriana",3015));
		System.out.println(grupo);
	}
}
