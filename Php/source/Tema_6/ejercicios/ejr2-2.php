<html>
<head>
	<title>Su nombre es...</title>
</head>
<body> 
	<?php
		$nom=$_REQUEST['nombre'];
		if (strcmp($nom,"admin)")==0) {
			echo "Bienvenido administrador.";
		} else {
			echo "Bienvenido ".$nom;
		}
	?>
</body>
</html>
