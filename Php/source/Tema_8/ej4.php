<?php
	session_name('misesion');
	session_register('contador');
	echo '<a href="'.$_SERVER['PHP_SELF'].'?'.SID.'">
			Contador vale: '.++$_SESSION['contador'].'
		</a><br>';
	echo 'El nombre de la sesi&oacute;n es: '.session_name();
	echo '<br>La sesi&oacute;n es'. $_REQUEST['misesion'].'<br>';
?>
