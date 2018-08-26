package ejemplo11.beans;

 

public class MiBeanParaJsp

{

 // se crea la variable

 private String nombreUsuario = "";

 

 // Metodo de escritura para asignar un nuevo valor a la variable

 public void setNombreUsuario(String nuevoValor)

 {

  nombreUsuario = nuevoValor;

 }

 

 // Metodo de lectura para recuperar el valor actual de la variable

 public String getNombreUsuario()

 {

  return nombreUsuario;

 }

}

