<html>
<head>
	<title>Conjetura de Ulam</title>
</head>
<body> 
	<?php
		$num=$_REQUEST['num'];
		echo $num."<br>";
		do {
			if ($num%2==0){
				$num/=2;
			} else {
				$num=$num*3+1;
			}
			echo $num."<br>";
		} while ($num != 1);
	?>
</body>
</html>
