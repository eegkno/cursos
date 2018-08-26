<?php

/* Contar los elementos de un arreglo */
$a[0] = 1;
$a[1] = 3;
$a[2] = 5;
$result = count($a);
echo $result."<br>";

/* Uniendo arreglos */
$beginning = 'foo';
$end = array(1 => 'bar');
$result = array_merge((array)$beginning, (array)$end);
print_r($result);
echo "<br>";

/* Buscando una clave dentro de un arreglo */
$search_array = array('first' => 1, 'second' => 4);
echo array_key_exists('first', $search_array)."<br>";
echo "<br>";

/* Indica las posiciones en la que se encuentra un coincidencia */
$array = array("blue", "red", "green", "blue", "blue");
print_r(array_keys($array, "blue"));
echo "<br>";

/* Elimina el último elemento insertado en el arreglo */
$stack = array("naranja", "plátano", "manzana", "frambuesa");
$fruit = array_pop($stack);
print_r($stack);
echo "<br>";

/* Inserta los elementos al final del arreglo */
$stack = array("naranja", "plátano");
array_push($stack, "manzana", "arándano");
print_r($stack);
echo "<br>";

/* Busca si una cadena pertenece al arreglo */
$os = array("Mac", "NT", "Irix", "Linux");
echo in_array("Irix", $os)."<br>";
echo in_array("Windows", $os)."<br>";




?>