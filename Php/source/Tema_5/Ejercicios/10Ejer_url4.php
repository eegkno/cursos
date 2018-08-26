<?php
/*
Modificar la función obtenerTodasUrls() que reciba una página  y
regrese un arreglo multidimensional con los sitios y los links
que tienen en cada sitio
*/

$page = '<a href="www.google.com"> Google </a><br>
<a href="www.eluniversal.com.mx"> El_Universal </a><br>
<a href="www.cnn.com.mx"> CNN </a><br>
<a href="www.gmail.com"> Google </a><br>
<a href="plus.google.com"> Google </a><br>
<a href="www.mexicocnn.com.mx"> CNN </a><br>
<a href="drive.google.com"> Google </a><br>';

function obtenerTodasUrls(){}



echo obtenerTodasUrls($page); 
//>>> [ Google [www.google.com, www.gmail.com, plus.google.com, drive.google.com ], 
//		El_Universal [www.eluniversal.com.mx],
//		CNN [ www.cnn.com.mx, www.mexicocnn.com  ] ]

?>