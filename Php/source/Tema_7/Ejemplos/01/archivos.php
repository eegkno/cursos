<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
</head>
<body>

<?php include_once("php/funciones.php")

?>


<?php
$archivo = "files/noticia.txt";
$texto=CargarTXT($archivo);
$lineas=sizeof($texto); 

for($i=0;$i<$lineas;$i++) 
{ 
	echo $texto[$i];
}?>


</body>
</html>