<?php

require_once("../conf/db.php");



/*
*	Nombre: 	AbrirConexion
*	Parametros:	Ninguno
*	Retorno:	Conexion a la base de datos
*	Descripcion: 	Funcion que se ncarga de establecer la conexion a la base de datos
*/


	function AbrirConexion()
	{
   		global $HOST, $PORT,$USER,$PASSWORD,$DBNAME;

		if (!($link=pg_connect("host=$HOST port=$PORT  user=$USER password=$PASSWORD dbname=$DBNAME")))
   		{
      			exit();
   		}
   		return $link;
	} 

/*
*	Nombre: 	select
*	Parametros:	Una cadena que contiene el query
*	Retorno:	Un arreglo con la matriz obtenida de la base de datos
*	Descripcion:	Funcion que se encarga de realizar una consulta en la base de datos.
*/

	function select($consulta)
	{
    		//echo "entrando en el select \n";
    		$link=AbrirConexion();
    		//echo $consulta."\n";	    

		$rows=0;
		
    		$ejecuta_query=pg_query($link,$consulta);
		if($ejecuta_query){
    			$rows=pg_num_rows($ejecuta_query);
   			$cols = pg_num_fields($ejecuta_query);
		}
    		//echo "rows = ".$rows." cols = ".$cols;

    		if($rows > 0){
		//	echo "se encontraron datos y se va a rellenar el arreglo.";
			for ($i = 0; $i < $rows; $i++){
				for($j=0; $j < $cols ; $j++){
					$arreglo[$i][$j]=pg_result($ejecuta_query,$i,$j);
					//echo $arreglo[$i][$j];
				}
			}
		}else{
			$arreglo[0][0]="vacio";

		}

		pg_close($link);
		return $arreglo;
	}


/*
*	Nombre: 	inserta
*	Parametros:	Una cadena que contiene el query
*	Retorno:	Regresa un valor booleano
*	Descripcion:	Funcion que se encarga de realizar un insert en la base de datos.
*/

	function insert($consulta){
	
		$link=AbrirConexion();

		$resultado = pg_query($consulta); 
	/*		if($resultado) 
		{ 
			echo "Se inserto correctamente"; 
		} 
		else 
		{ 
			echo "error"; 
		}
	*/
		return $resultado; 
	}

?> 
