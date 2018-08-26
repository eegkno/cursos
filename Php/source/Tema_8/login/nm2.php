<?php
        session_start();
        $user = trim($_SESSION['usr']);
        $pass = trim($_SESSION['pass']);
?>
<html>
<head>
	<title>Su n&uacute;mero es...</title>
</head>
<body>
	<CENTER>
	<?php
	if ($user=="curso" && $pass=="PHP"){
                $_SESSION['usr'] = $user;
                $_SESSION['pass'] = $pass;
		echo "<p align=rigth><A href=cerrarSesion.php>Cerrar sesi&oacute;n</A></p>";
		$num=0;
		if (isset($_REQUEST['uno'])) {
			$num+=1;
		}
		if (isset($_REQUEST['dos'])) {
			$num+=2;
		}
		if (isset($_REQUEST['cuatro'])) {
			$num+=4;
		}
		echo "Hola ".$user."<br>";
		echo "El n&uacute;mero que pens&oacute; es: ".$num;
	} else {
                echo "No se inici&oacute; sesi&oacute;n correctamente.<br>";
                echo "<A href=loginForm.html>Iniciar sesi&oacute;n</A>.<br>";
        }
	?>
	</CENTER>
</body>
</html>
