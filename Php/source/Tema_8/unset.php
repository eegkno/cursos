<?PHP
	$sistemas = array(
			'Canonical' => 'Ubuntu',
			'Novell' => 'Suse',
			'Microsoft' => 'Windows 7',
			'RedHat,INC' => 'RedHat Linux');
 
	// Imprime el arreglo original
	var_dump($sistemas);
	echo "<HR>"; 

	// Elimina el elemento especificado
	unset($sistemas['Microsoft']);
 
	// Imprime arreglo final
	var_dump($sistemas);
?>
