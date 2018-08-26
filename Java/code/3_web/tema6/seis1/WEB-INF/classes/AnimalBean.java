package javabean;

public class AnimalBean{
	private int registro;		//identificador del animal
	private String especie;		//especia a la que pertenece, ej. Felinos, Aves
	private String subespecie;	// leon, gato, pantera
	private String nombre;		//nombre del animal
	private int edad;		//edad en anios

	public AnimalBean(){}
	
	public AnimalBean(String especie, String subespecie, String nombre, int edad){
		this.registro = 0;
		this.especie = especie;
		this. subespecie = subespecie;
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	public AnimalBean(int registro, String especie, String subespecie, String nombre, int edad){
		this.registro = registro;
		this.especie = especie;
		this. subespecie = subespecie;
		this.nombre = nombre;
		this.edad = edad;
	
	}
	public void setRegistro(int registro){
		this.registro = registro;
	} 

	public void setEspecie(String especie){
		this.especie = especie;
	} 

	public void setSubespecie(String subespecie){
		this.subespecie = subespecie;
	} 

	public void setNombre(String nombre){
		this.nombre = nombre;
	} 

	public void setEdad(int edad){
		this.edad = edad;
	} 

	public int getRegistro(){
		return registro;
	} 

	public String getEspecie(){
		return especie;
	} 

	public String getSubespecie(){
		return subespecie;
	} 

	public String getNombre(){
		return nombre;
	} 

	public int getEdad(){
		return edad;
	} 
	
	public void imprimeDatosAnimal(){
		System.out.println(" Registro   : "+ registro);
		System.out.println(" Especie    : "+especie);
		System.out.println(" Subespecie : "+subespecie);
		System.out.println(" Nombre     : "+nombre);
		System.out.println(" Edad       : "+edad);
	}	
}
