<?php

require('soporte.php') ;

class cinta_video extends soporte{
   private $duracion;

   function __construct($tit,$num,$precio,$duracion){ 
      parent::__construct($tit,$num,$precio); 
      $this->duracion = $duracion; 
   } 

   public function imprime_caracteristicas(){ 
      echo "Película en VHS:<br>"; 
      parent::imprime_caracteristicas(); 
      echo "<br>Duración: " . $this->duracion; 
   } 
}



$micinta = new cinta_video("Los Otros", 22, 4.5, "115 minutos");
echo "<b>" . $micinta->titulo . "</b>"; 
echo "<br>Precio: " . $micinta->dame_precio_sin_iva() . " euros"; 
echo "<br>Precio IVA incluido: " . $micinta->dame_precio_con_iva() . " euros";


?>