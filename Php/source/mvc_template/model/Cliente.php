<?php

class Cliente{


       private $nombre="";
       private $apellidos="";
       private $edad="";
       private $genero="";
       private $cp="";
       private $serviceTag="";
       private $p00="";
       private $p01="";
       private $p10="";
       private $p11="";
       

       public function getNombre(){
              return $this->nombre;
       }

       public function getApellidos(){
              return $this->apellidos;
       }

       public function getEdad(){
              return $this->edad;
       }

       public function getGenero(){
              return $this->genero;
       }

       public function getCp(){
			  return $this->cp;
       }

       public function getServiceTag(){
              return $this->serviceTag;
       }

       public function getP00 (){
              return $this->p00;
       }

	   public function getP01 (){
              return $this->p01;
       }
	   
	   public function getP10 (){
              return $this->p10;
       }
	   
	   public function getP11 (){
              return $this->p11;
       }
      




       public function setNombre($nombre){
              $this->nombre=$nombre;
       }

       public function setApellidos($apellidos){
              $this->apellidos=$apellidos;
       }

       public function setEdad($edad){
              $this->edad=$edad;
       }

       public function setGenero($genero){
		$this->genero=$genero;
       }


       public function setCp($cp){
              $this->cp=$cp;
       }

       public function setServiceTag ($serviceTag){
              $this->serviceTag=$serviceTag;
       }

       public function setP00($p00){
              $this->p00 = $p00;
       }

       public function setP01($p01){
              $this->p01 = $p01;
       }

       public function setP10($p10){
              $this->p10 = $p10;
       }

       public function setP11($p11){
              $this->p11 = $p11;
       }

}



?>
