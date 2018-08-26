	<center><H2>Tabla de datos</H2></center>
  	<Table align=Center Border=1 width=60%>
  	<TR>
    	<TH>Número</TH>
    	<TH>Cuadrado</TH>
    	<TH>Cubo</TH>
  	</TR>
<?PHP
  	for ($i=1; $i<=15; $i++) {
    		$cuadrado = $i * $i;
    		$cubo = $i * $i * $i;
    		echo"<Tr>";  
      		echo"<td align=Center>".$i; 
      		echo"<td align=Center>".$cuadrado; 
      		echo"<td align=Center>".$cubo; 
    		echo"</Tr>";
   	}
?>
  	</Table>
