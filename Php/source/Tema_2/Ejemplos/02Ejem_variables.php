<?php

	$var_boolean = true; 	// puede tener dos valores, falso y verdadero
	echo $var_boolean.'<br>';
	
	$a = 1234; 				// n�mero decimal
	echo $a.'<br>';
	$a = -123; 				// un n�mero negativo
	echo $a.'<br>';
	$a = 0123; 				// n�mero octal (equivalente a 83 decimal)
	echo $a.'<br>';
	$a = 0x1A+'\n'; 		// n�mero hexadecimal (equivalente a 26 decimal)
	echo $a.'<br>';
	$a=3.1416;				// n�mero decimal
	echo $a.'<br>';
	$str="hola";			// cadena
	echo $str.'<br>';
	
	echo "\$var_boolean es de tipo ".gettype($var_boolean)."<br>";
	echo "\$a es de tipo ".gettype($a)."<br>";
	echo "\$str es de tipo ".gettype($str)."<br>";
		
	echo "\$var_boolean es entero ".is_int($var_boolean)."<br>";
	echo "\$var_boolean es cadena ".is_string($var_boolean)."<br>";
	echo "\$str es cadena ".is_string($str)."<br>";
	
	
?>