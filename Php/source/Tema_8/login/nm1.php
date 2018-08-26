<?php
        session_start();
	$user = trim($_SESSION['usr']);
        $pass = trim($_SESSION['pass']);
?>
<html>
<head>
	<title>N&uacute;mero m&aacute;gico</title>
</head>
<body>
	<CENTER>
<?PHP
        if ($user=="curso" && $pass=="PHP"){
                $_SESSION['usr'] = $user;
                $_SESSION['pass'] = $pass;
?>
		<p align=rigth><A href=cerrarSesion.php>Cerrar sesi&oacute;n</A></p>
		<form action="nm2.php" method="post">
			Piense en un n&uacute;mero...<br>
			Seleccione la columna en la que se encuentra el n&uacute;mero que pens&oacute;:
			<br>
			1 3 5 7<input type="checkbox" name="uno">
			<br>
			7 6 2 3<input type="checkbox" name="dos">
			<br>
			6 5 7 4<input type="checkbox" name="cuatro">
			<br>
			<input type="submit" name="Enviar">
		</form>
<?PHP
	} else {
		echo "No se inici&oacute; sesi&oacute;n correctamente.<br>";
		echo "<A href=loginForm.html>Iniciar sesi&oacute;n</A>.<br>";
	}
?>
	</CENTER>
</body>
</html>
