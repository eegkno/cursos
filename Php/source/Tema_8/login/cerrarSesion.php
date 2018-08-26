<?PHP
	session_start();
?>
<html>
<head>
        <title>Cerrar sesi&oacute;n</title>
</head>
<body>
<?php
	// se eliminan todas las variables de la sesión
	session_unset();
	// se destruye la sesión
	session_destroy();
?>
<CENTER>
Sesi&oacute;n cerrada correctamente.
</CENTER>
</body>
</html>
