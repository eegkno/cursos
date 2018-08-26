<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
</head>
<body>

<?php include_once("php/funciones.php")?>


	<h2>&Uacute;ltimas Noticias</h2>
      	
	<hr> </hr>	

<?php
$archivo = "xml/noticias.xml";
$matriz=CargarXML($archivo);
$num_noticias=sizeof($matriz); 

for($i=0;$i<$num_noticias;$i++) 
{ ?>
 
	<strong><?php echo utf8_decode ( $matriz[$i]["editorial"] )?>	</strong></br>
	<a href="<?php echo "noticias/".$matriz[$i]["archivo"] ?>" target="__blank" ><?php echo utf8_decode ( $matriz[$i]["titulo"] )?></a></br>
	<em>por <?php echo utf8_decode ( $matriz[$i]["autor"] )?>	</em></br>
	
	<?php echo utf8_decode ($matriz[$i]["pais"]) ?>, <?php echo $matriz[$i]["fecha"] ?>	

	<hr> </hr>
	<?php 
	$query ="insert into noticias values ('".$matriz[$i]["editorial"]."','".$matriz[$i]["titulo"]."','".$matriz[$i]["archivo"]."','".$matriz[$i]["autor"]."','".$matriz[$i]["pais"]."','".$matriz[$i]["fecha"]."')"; 
	echo "<br> Insert = ".insert($query);
	?>
<?php }
?>
</body>
</html>