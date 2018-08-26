<jsp:useBean id="mibean" class="cinco2.beans.MiBeanParaJsp" scope="session" />
<html>
<head>
	<title>Validacion del usuario</title>
</head>
<body bgcolor="#FFFFFF" text="#000000">
	<div align="center">
		<b>
		<font face="Arial, Helvetica, sans-serif" size="+3">
		Este es el segundo JSP<br>
		Bienvenido 
		<jsp:getProperty name="mibean" property="nombre" />
		</font>
		</b>
	</div>
	<p> Tus datos son: 
	<p>Direccion: 
	<jsp:getProperty name="mibean" property="dir" />
	<br>
	Carrera: 
	<jsp:getProperty name="mibean" property="carrera" />
	<br>
	Sexo: 
	<jsp:getProperty name="mibean" property="sexo" />
	<br>
	Edad: 
	<jsp:getProperty name="mibean" property="edad" />
</body>
</html>
