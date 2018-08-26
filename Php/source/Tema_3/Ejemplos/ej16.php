<?PHP
	// strcmp
	echo "<H1> strcmp </H1>";
	$c1 = "Juan";
	$c2 = "juan";
	echo $c1." y " .$c2." son: ".strcmp($c1,$c2);
	echo "<BR>";
	$c2 = "Juan";
	echo $c1." y " .$c2." son: ".strcmp($c1,$c2);
	echo "<BR>";

	// strpos
	echo "<H1>eregi_replace</H1>";
	$cadena = "Anita lava la tina";
	$buscar = "lava";
	echo "La cadena buscada se encuentra en la posición: " . strpos($cadena,$buscar);
?>
