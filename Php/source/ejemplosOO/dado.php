<?php
class dado{
    public $puntos; 

    function __construct(){ 
       srand((double)microtime()*1000000); 
    }

    public function tirate(){ 
       $this->puntos=$randval = rand(1,6); 
    } 
} 

$mi_dado = new dado(); 

for ($i=0;$i<30;$i++){ 
    $mi_dado->tirate(); 
    echo "<br>Han salido " . $mi_dado->puntos . " puntos"; 
} 

?>