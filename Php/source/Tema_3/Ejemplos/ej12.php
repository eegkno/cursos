<?PHP
	// trim
   	$cadena = " buenas tardes ";
   	echo "<H3>trim</h3>";
   	echo "Cadena" . $cadena . "con espacios.";
   	echo "<BR><BR>";
	echo "Cadena" . trim($cadena) . "sin espacios.";

	// Itrim
   	echo "<H3>ltrim</h3>";
   	echo "Cadena" . $cadena . "con espacios.";
   	echo "<BR><BR>";
	echo "Cadena" . ltrim($cadena) . "sin espacio al inicio.";

	// chop
   	echo "<H3>chop</h3>";
   	echo "Cadena" . $cadena . "con espacios.";
   	echo "<BR><BR>";
	echo "Cadena" . chop($cadena) . "sin espacio al final.";
?>
