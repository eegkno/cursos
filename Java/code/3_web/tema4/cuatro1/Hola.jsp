<%--Esto es un comentario--%>
<%!
	//Se declara una variable de tipo String
	String cadena;
%>

<%-- Usando un scriptlet --%>
<%
	cadena =" Hola<br>Bienvenido al tema JSPs";
%>

<html>
<body>
	<br>
	<%-- Usando un expresion --%>
	<center><%= cadena %></center>
   	<p>
</body> 
</html>
