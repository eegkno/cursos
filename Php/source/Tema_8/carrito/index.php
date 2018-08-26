<?php 
	session_start(); 
	$item=$_POST['item']; 
	$cantidad=$_POST['cantidad']; 
	$itemsEnCesta=$_SESSION['itemsEnCesta']; 
	$encontrado=0;
	if ($item){
		if (!isset($itemsEnCesta)){ 
			$itemsEnCesta[$item]=$cantidad; 
		}else{
			foreach($itemsEnCesta as $k => $v){
				if ($item==$k){   
					$itemsEnCesta[$k]+=$cantidad;
					$encontrado=1;  
				}     
			}
			if (!$encontrado)
				$itemsEnCesta[$item]=$cantidad;   
		} 
	} 
	$_SESSION['itemsEnCesta']=$itemsEnCesta; 
?> 
<html> 
<body> 
	<tt> 
	<form action="<?=$PHP_SELF."?".$SID?>" method="post"> 
		Nombre del producto <input type="text" name="item" size="20"><br> 
		N&uacute;mero de unidades <input type="text" name="cantidad" size="20"><br> 
		<input type="submit" value="Añadir a la cesta"><br> 
	</form> 
<? 
	if (isset($itemsEnCesta)){ 
		echo'El contenido de la cesta de la compra es:<br>'; 
		foreach($itemsEnCesta as $k => $v){ 
			echo 'Artículo: '.$k.' ud: '.$v.'<br>'; 
		}
	}
?>
	</tt>
</body> 
</html>
