<?PHP
	$arregloAleatorio = range(100,150);
	echo "<H2>Arreglo generado de manera aleatoria.</H2>";
	echo "<H3><Hr>";
	for (;list($i,$num)=each($arregloAleatorio);) {
      		echo $num . "<br>";
	}
?>
