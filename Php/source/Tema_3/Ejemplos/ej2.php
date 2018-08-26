<HTML>
<TITLE>Ej 3.2 Arreglos</TITLE>
<META http-equiv="Content-type" content="text/html; charset=utf-8" />
<BODY>
<?PHP
	// Inicializacion de un arreglo unidimensional
	// de varios tipos de datos.
	$Empleado[0] = 543;
	$Empleado[1] = "José Pérez";
	$Empleado[2] = "5675.5";
	$Empleado[3] = $Empleado[2]*1.5;
	$Empleado[4] = "Supervisor";

	// Impresion de los datos

	echo ("Número de trabajador: " . $Empleado[0] . "<Br>");
	echo ("Nombre: " . $Empleado[1] . "<Br>");
	echo ("Sueldo: " . $Empleado[2] . "<Br>");
	echo ("Sueldo con estímulos: " . $Empleado[3] . "<Br>");
	echo ("Puesto: " . $Empleado[4] . "<Br>");
?>
</BODY>
</HTML>
