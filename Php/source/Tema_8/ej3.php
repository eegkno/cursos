<?php 
	// Se registra la variable contador en la sesión
	session_register('contador');

	// Enlace hacia la propia página que incrementa la variable contador
	echo '<a href="'.$_SERVER['PHP_SELF'].'?'.SID.'">Contador: '.++$_SESSION['contador']. '</a>'; 
?>
