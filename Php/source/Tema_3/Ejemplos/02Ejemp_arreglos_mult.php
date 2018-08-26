<?php

/*Arreglo multidimensional */
$supermercado = array("Electrodomesticos" => array("Televisor",  "Heladera"), "alimentos" => array("Carne", "Leche", "Verduras"));
echo ($supermercado["Electrodomesticos"][1])."<br>";
echo ($supermercado["alimentos"][2])."<br>";

/*insertando elementos a un arreglo interno*/
array_push($supermercado["alimentos"], "manzana", "arándano");
print_r($supermercado);
echo "<br>";

/*quitando elementos a un arreglo interno*/
$fruit = array_pop($supermercado["Electrodomesticos"]);
print_r($supermercado);
echo "<br>";

/*contando elementos de los arreglos */
echo count($supermercado["Electrodomesticos"])."<br>";
echo count($supermercado["alimentos"])."<br>";
echo count($supermercado)."<br>";

?>

