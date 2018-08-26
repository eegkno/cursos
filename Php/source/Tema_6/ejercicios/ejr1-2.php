<html>
<head>
	<title>checkbox</title>
</head>
<body> 
	<?php
		$num=0;
		if (isset($_REQUEST['uno'])) {
			echo "Se seleccionó el checkbox =)";
		} else {
			echo "No se seleccionó el checkbox =(";
		}
	?>
</body>
</html>
