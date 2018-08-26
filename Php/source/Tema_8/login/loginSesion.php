<?php
	session_start();
?>
<html>
<head>
	<title>Validar usuario</title>
</head>
<body>
	<CENTER>
<?PHP
	$user = trim($_REQUEST['usr']);
	$pass = trim($_REQUEST['pass']);
	if ($user=="curso" && $pass=="PHP"){
		$_SESSION['usr'] = $user;
		$_SESSION['pass'] = $pass;
		echo "<p align=rigth><A href=cerrarSesion.php>Cerrar sesi&oacute;n</A></p>";
		echo "<H2>Bienvenido al curso de PHP</H2><br>";
		echo "Selecciona una opci&oacute;n:<br>";
?>
		<TABLE>
                <TR>
                        <TD><A href=nm1.php>N&uacute;mero m&aacute;gico.</a></TD>
                </TR>
                <TR>
                        <TD><A href=ulam1.php>Conjetura de Ulam.</a></TD>
                </TR>
                </TABLE>
<?PHP
	} else {
		echo "<H2>Usuario o contraseña incorrectos.</H2><br>";
	}
?>
	</CENTER>
</body>
</html>
