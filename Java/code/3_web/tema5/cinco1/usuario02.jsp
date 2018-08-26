<jsp:useBean id="mibean" class="cinco1.beans.MiBeanParaJsp" scope="session" />
<html>
<head>

	<title>Validacion del usuario</title>
</head>
<body bgcolor="#FFFFFF" text="#000000">
	<div align="center">
		<b>
		<font face="Arial, Helvetica, sans-serif" size="+3">
		Este es el segundo JSP<br>
		Bienvenido : <jsp:getProperty name="mibean" property="nombreUsuario" />
		</font>
		</b>
	</div>
</body>
</html>
