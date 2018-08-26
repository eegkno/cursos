<?PHP
	$n=100;
	echo "Múltiplos de 7 entre [100, 400]<br><hr>";
	do {
		if ($n%7 == 0) {
        		echo "$n - ";
       		}
      		$n++;
	} while ($n<400);
?>
