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
$query="select * from noticias";
$matriz = select($query);
$num_noticias=sizeof($matriz); 


for($i=0;$i<$num_noticias;$i++) 
{ ?>
 
	<strong><?php echo utf8_decode ( $matriz[$i][0] )?>	</strong></br>
	<a href="<?php echo "noticias/".$matriz[$i][1] ?>" target="__blank" ><?php echo utf8_decode ( $matriz[$i][2] )?></a></br>
	<em>por <?php echo utf8_decode ( $matriz[$i][3] )?>	</em></br>
	
	<?php echo utf8_decode ($matriz[$i][4]) ?>, <?php echo $matriz[$i][5] ?>	

	<hr> </hr>

<?php }
?>
</body>
</html>