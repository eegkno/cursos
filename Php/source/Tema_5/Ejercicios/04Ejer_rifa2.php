<?php

/*Se decidi� que los nombres que empiezan con E
tambi�n entren en la rifa, modificar el c�digo 
de rifa para que se tome esta nueva consideraci�n*/


function enRifa(){}


echo enRifa("David");
//>>> True

echo enRifa("Edgar");
//>>> True

echo enRifa("Jorge");
//>>> False


?>