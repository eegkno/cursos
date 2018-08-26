<?PHP
  	// Lista con índices aleatorios
     	$lista[10] = "Marcelo";
     	$lista[20] = "Alicia";
     	$lista[15] = "Alejandra";
     	$lista[35] = "Mario";
     	$lista[12] = "Alberto";

  	reset($lista);		// Apuntador a la primera posición
  	echo ("<H2>Lista de Nombres</H2>");
  	echo ("<Hr>");
  	do {
     		// Buscar posicion especificada
     		$i = key($lista);
     		// Buscar contenido en esa posicion
     		$nombre = current($lista);
     		echo ("Posición: " . $i . "<BR>");
     		echo ("Nombre: " . $nombre);
     		echo ("<HR><BR>");
	} while (next($lista));
?>
