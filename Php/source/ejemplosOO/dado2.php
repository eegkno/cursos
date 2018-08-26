<?php
class dado{
    private $puntos; 

    function __construct(){ 
       srand((double)microtime()*1000000); 
    } 

    private function tirate(){ 
       $this->puntos=$randval = rand(1,6); 
    } 

    public function dame_nueva_puntuacion(){ 
       $this->tirate(); 
       return $this->puntos; 
    } 
} 

$mi_dado = new dado(); 

for ($i=0;$i<30;$i++){ 
    echo "<br>Han salido " . $mi_dado->dame_nueva_puntuacion() . " puntos"; 
}
?>