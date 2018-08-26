<?php

/* Cortando Cadenas */

echo substr("abcdef", -1)."<br>";    // devuelve "f"
echo substr("abcdef", -2)."<br>";    // devuelve "ef"
echo substr("abcdef", -3, 1)."<br>"; // devuelve "d"


echo substr('abcdef', 1)."<br>";     // bcdef
echo substr('abcdef', 1, 3)."<br>";  // bcd
echo substr('abcdef', 0, 4)."<br>";  // abcd
echo substr('abcdef', 0, 8)."<br>";  // abcdef
echo substr('abcdef', -1, 1)."<br>"; // f


// El acceso a caracteres específicos en una cadena 
// se puede conseguir usando "corchetes"
$string = 'abcdef';
echo $string[0]."<br>";                 // a
echo $string[3]."<br>";                 // d
echo $string[strlen($string)-1]."<br>"; // f

/* Longitud de una cadena */

$str = "cadenas";
echo strlen($str)."<br>";

/* Encontrando Cadenas */
$str = 'cadenas';
$pattern   = 'a';
echo strpos($str, $pattern)."<br>";	// Encuentra la primera posición del patrón solicitado
echo strrpos($str, $pattern)."<br>";	// Encuentra la última posición del patrón solicitado

echo strpos($str, $pattern , 2)."<br>"; // Encuentra el patrón después del índice
echo strrpos($str, $pattern, -3)."<br>";	// Encuentra el patrón después del índice

/* Separando una cadena */

$str = "La empresa Google anunció hoy la sexta edición del concurso Doodle";

$strarray = explode(" ", $str);

echo $strarray[0]."<br>";
echo $strarray[1]."<br>";
echo $strarray[2]."<br>";
echo $strarray[3]."<br>";
echo $strarray[4]."<br>";
echo $strarray[5]."<br>";
echo $strarray[6]."<br>";
echo $strarray[7]."<br>";
echo $strarray[8]."<br>";
echo $strarray[9]."<br>";
echo $strarray[10]."<br>";



?>