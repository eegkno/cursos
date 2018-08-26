<?php

/*Se decidió que los nombres que empiezan con E
también entren en la rifa, modificar el código 
de rifa para que se tome esta nueva consideración*/


function enRifa(){}


echo enRifa("David");
//>>> True

echo enRifa("Edgar");
//>>> True

echo enRifa("Jorge");
//>>> False


?>