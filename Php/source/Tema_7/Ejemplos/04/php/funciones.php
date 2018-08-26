<?php

if (PHP_VERSION>='5')
require_once('php/domxml-php4-to-php5.php'); 


function CargarXML($archivo) {
 
	$contenido = ""; 

	if($da = fopen($archivo,"r")) { 
		while ($aux= fgets($da)) {     //fgets obtiene una línea del archivo hasta alcanzar el final
			$contenido.=$aux; 
		}
 
		fclose($da); 
	} else { 
		echo "Error: no se ha podido leer el archivo <strong>$archivo</strong>"; 
	} 

	/*limpia_especiales($contenido);*/

	$tagnames = array ("editorial","titulo","autor","archivo","pais","fecha"); //descriptores del archivo XML

	if (!$xml = domxml_open_mem($contenido)) { 
		echo "Ha ocurrido un error al procesar el documento<strong> \"$archivo\"</strong> a XML <br>"; 
		exit; 
	} else { 
		$raiz = $xml->document_element(); 
		$tam=sizeof($tagnames); 

		for($i=0; $i<$tam; $i++) { 
			$nodo = $raiz->get_elements_by_tagname($tagnames[$i]); 
			$j=0; 
			foreach ($nodo as $etiqueta) { 
				$matriz[$j][$tagnames[$i]]= $etiqueta->get_content();
				$j++; 
			} 
		} 
	return $matriz; 
	} 
} 

function CargarTXT($archivo){

	$contenido = ""; 

	if($da = fopen($archivo,"r")) { 
		while ($aux= fgets($da)) {     //fgets obtiene una línea del archivo hasta alcanzar el final
			$contenido.=$aux; 
		}
 
		fclose($da); 
	} else { 
		echo "Error: no se ha podido leer el archivo <strong>$archivo</strong>"; 
	}
	
	return $contenido;

}


function Conectarse() 
{ 
   if (!($link=mysql_connect("localhost","root",""))) 
   { 
      echo "Error conectando a la base de datos."; 
      exit(); 
   } 
   if (!mysql_select_db("curso",$link)) 
   { 
      echo "Error seleccionando la base de datos."; 
      exit(); 
   } 
   return $link; 
}

	function select($consulta)
	{
    		//echo "entrando en el select \n";
    		$link=Conectarse();
    		//echo $consulta."\n";	    

		$rows=0;
		
    		$ejecuta_query=mysql_query($consulta, $link);
		if($ejecuta_query){
    			$rows=mysql_num_rows($ejecuta_query);
   			$cols = mysql_num_fields($ejecuta_query);
		}
    		//echo "rows = ".$rows." cols = ".$cols;

    		if($rows > 0){
		//	echo "se encontraron datos y se va a rellenar el arreglo.";
			for ($i = 0; $i < $rows; $i++){
				for($j=0; $j < $cols ; $j++){
					$arreglo[$i][$j]=mysql_result($ejecuta_query,$i,$j);
					//echo $arreglo[$i][$j];
				}
			}
		}else{
			$arreglo[0][0]="vacio";

		}

		mysql_close($link);
		return $arreglo;
	}
	
	function insert($consulta)
	{
    		$link=Conectarse();
			return mysql_query($consulta,$link); 			
	
	
	}
	
	
?>