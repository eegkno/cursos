package cinco2.beans;

public class MiBeanParaJsp {
	private String nombre = "";
	private String dir = "";
	private String carrera = "";
	private String sexo = "";
	private int edad = 0;

   	public String getNombre() {
      		return nombre;
	}

	public void setNombre(String newNombre){
     		nombre = newNombre;
 	}

	public String getDir() {
		return dir;
	}

	public void setDir(String newDir) {
		dir = newDir;
	}

	public String getCarrera() {
      		return carrera;
	}

	public void setCarrera(String newCarrera) {
 		carrera = newCarrera;
 	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String newSexo) {
		sexo = newSexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int newEdad) {
		edad = newEdad;
	}
}
