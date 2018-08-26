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

	$contenido = array(); 
	
	if($da = fopen($archivo,"r")) { 
		while ($aux= fgets($da)) {     //fgets obtiene una línea del archivo hasta alcanzar el final
			array_push($contenido, nl2br($aux));
		}
 
		fclose($da); 
	} else { 
		echo "Error: no se ha podido leer el archivo <strong>$archivo</strong>"; 
	}
	
	return $contenido;

}


?>