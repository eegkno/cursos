<?PHP
	// strpos
	echo "<H1> strpos </H1>";
	$cadena = "La insoportable levedad del ser";
	echo "Cadena: ".$cadena."<br>";
	$buscar="leve";
	echo "Busca " .$buscar. " y la encuentra en posición: ".strpos($cadena,$buscar);
	echo "<BR>";

	// ereg
	echo "<H1>ereg</H1>";
	echo "Cadena: ".$cadena."<br>";
	echo $buscar. " se encuentra en la cadena?: ". ereg($buscar,$cadena);
	$buscar = Leve;
	echo $buscar. " se encuentra en la cadena?: ". ereg($buscar,$cadena);

	// eregi
	echo "<H1>eregi</H1>";
	echo "Cadena: ".$cadena."<br>";
	echo $buscar. " se encuentra en la cadena?: ". eregi($buscar,$cadena);
?>
