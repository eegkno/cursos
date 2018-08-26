<?php
require('soporte.php') ;

class juego extends soporte{
   public $consola; //nombre de la consola del juego ej: playstation 
   private $min_num_jugadores; 
   private $max_num_jugadores; 

   function __construct($tit,$num,$precio,$consola,$min_j,$max_j){ 
      parent::__construct($tit,$num,$precio); 
      $this->consola = $consola; 
      $this->min_num_jugadores = $min_j; 
      $this->max_num_jugadores = $max_j; 
   } 

   public function imprime_jugadores_posibles(){ 
      if ($this->min_num_jugadores == $this->max_num_jugadores){ 
         if ($this->min_num_jugadores==1) 
         echo "<br>Para un jugador"; 
         else 
         echo "<br>Para " . $this->min_num_jugadores . " jugadores"; 
      }else{ 
       echo "<br>De " . $this->min_num_jugadores . " a " . $this->max_num_jugadores . " Jugadores."; 
      } 
   }

   public function imprime_caracteristicas(){ 
      echo "Juego para: " . $this->consola . "<br>"; 
      parent::imprime_caracteristicas(); 
      echo "<br>" . $this->imprime_jugadores_posibles(); 
   } 
} 


$mijuego = new juego("Final Fantasy", 21, 2.5, "Playstation",1,1);
$mijuego->imprime_caracteristicas(); 

//esta línea daría un error porque no se permite acceder a un atributo private del objeto 
//echo "<br>Jugadores: " . $mijuego->min_num_jugadores; 
//habria que crear un método para que acceda a los atributos private 
$mijuego->imprime_jugadores_posibles(); 

echo "<p>"; 
$mijuego2 = new juego("GP Motoracer", 27, 3, "Playstation II",1,2); 
echo "<b>" . $mijuego2->titulo . "</b>"; 
$mijuego2->imprime_jugadores_posibles();
?>