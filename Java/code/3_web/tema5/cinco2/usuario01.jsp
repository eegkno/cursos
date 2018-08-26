<html>
<head>
	<title>Validacion del usuario</title>
</head>
<body bgcolor="#FFFFFF" text="#000000">
	<div align="center"><b><font face="Arial, Helvetica, sans-serif" size="+3">
	<jsp:useBean id="mibean" class="cinco2.beans.MiBeanParaJsp" scope="session" />
		<jsp:setProperty name="mibean" property="nombre" />
        	<jsp:setProperty name="mibean" property="dir" />
             	<jsp:setProperty name="mibean" property="carrera" />
             	<jsp:setProperty name="mibean" property="sexo" />
             	<jsp:setProperty name="mibean" property="edad" />
	</jsp:useBean>
	Bienvenido <jsp:getProperty name="mibean" property="nombre" />
	</font></b> </div>
	<p>Tus demas datos son:
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
	<p> <a href="usuario02.jsp">Liga al segundo JSP</a> 
</body>
</html>
