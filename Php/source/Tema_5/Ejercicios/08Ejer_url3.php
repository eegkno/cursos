<?php
/*
Realizar una funci�n obtenerTodasUrls() que reciba una p�gina  y
regrese todas las urls dentro de la p�gina. Hacer uso de la funci�n 
siguienteUrl() ya creada. Regresar un arreglo con todas las urls encontradas.
*/

$page = '<a href="www.google.com"> Google </a><br>
<a href="www.eluniversal.com.mx"> El Universal </a><br>
<a href="www.cnn.com.mx"> CNN </a><br>
<a href="www.gmail.com"> Gmail </a><br>';


function obtenerTodasUrls(){}


echo obtenerTodasUrls($page); 
//>>> [ www.google.com, www.eluniversal.com.mx, www.cnn.com.mx, www.gmail.com ]

?>