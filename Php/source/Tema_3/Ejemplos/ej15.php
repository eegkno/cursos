<?PHP
	// ereg_replace
	echo "<H1> ereg_replace </H1>";
	$cadena = "Anita ensucia la tina";
	echo "Cadena: ".$cadena."<br>";
	$buscar="ensucia";
	$reemplazar = "lava";
	echo "Reemplaza " .$buscar. " por ".$reemplazar.": ".ereg_replace($buscar,$reemplazar,$cadena);
	echo "<BR>";

	// eregi_replace
	echo "<H1>eregi_replace</H1>";
	echo "Cadena: ".$cadena."<br>";
	$buscar="Ensucia";
	echo "Reemplaza " .$buscar. " por ".$reemplazar.": ".eregi_replace($buscar,$reemplazar,$cadena);
?>
