import java.util.Comparator;

public class ComparadorNombreAlumno implements Comparator {
	public int compare(Object obj1, Object obj2){
		return ((Alumno)obj1).nombre.compareTo(((Alumno)obj2).nombre);
	}
}
