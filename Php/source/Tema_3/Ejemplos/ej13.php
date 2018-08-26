<?PHP
	// strlen
	echo "<H1> strlen </H1>";
	$cadena = "La insoportable levedad del ser";
	echo "La longitud de la cadena ".$cadena." es: " . strlen($cadena);
	echo "<BR>";

	// split
	echo "<H1>split</H1>";
	$frase = "Bonjour Monde";
	$fraseSeparada = split(" ", $frase);
	echo $fraseSeparada[0] ."<br>";
	print($fraseSeparada[1]."<br>");

	// substr
	echo "<H1>substr</H1>";
	$subFrase = substr($cadena,10,5);
	echo "Cadena original: ".$cadena."<br>";
	echo "Subcadena: ".$subFrase."<br>";
?>
