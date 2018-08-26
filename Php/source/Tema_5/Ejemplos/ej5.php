<?PHP
	$materia[100] = "Economía";
	$materia[2080] = "Administración";
	$materia[1450] = "Derecho";
	$materia[350] = "Ciencias Sociales";
	$materia[1220] = "Teología";

	echo "<H2>"."Lista de materias";
	echo "<H3>"."<HR>";
	while (list($i,$valor)=each($materia)){
		echo "Clave: " . $i . " - ";
		echo "Materia: " . $valor;
		echo "<Br>";
	}
?>
