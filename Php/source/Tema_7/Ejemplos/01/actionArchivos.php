<?php


	// basename devuelve el nombre del archivo seleccionado por el usuario (sin el resto de la ruta)
	$nombreArchivo = basename($_FILES['archivo']['name']);
	$aux = explode( ".", $nombreArchivo ) ;
	$extensionArchivo = $aux[ count($aux)-1 ];
	
	//$extensiones = array("jpg", "jpeg", "gif", "png", "JPG", "JPEG", "GIF", "PNG");
	$carpeta= "files/";
	
	date_default_timezone_set('America/Mexico_City');
	$nuevoNombre=date('d-M-Y H_i_s')." ".$aux[0].".".$extensionArchivo;
	
	//$ruta= $carpeta.$nuevoNombre;
	$ruta = $nombreArchivo;
	
	$subido = false; 
	
	if( $_FILES['archivo']['error']==0 ) 
		$subido = copy($_FILES['archivo']['tmp_name'], $ruta); 
	
	if($subido) 
	{
		echo "El archivo subi&oacute; con &eacute;xito"; 
		echo"<script language=\"javascript\">window.location=\"archivos.php\" \"</script>";
	}else{
		echo "Se ha producido un error: ".$error; 
	}	
		
?>		