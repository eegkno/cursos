<%
	String nombreUsuario = request.getParameter("nombre");
%>
<html>
<head>
	<title>Validacion del usuario</title>
</head>

<body bgcolor="#FFFFFF" text="#000000">
	<div align="center"><b>
	<font face="Arial, Helvetica, sans-serif" size="+3">
		Bienvenido <%=nombreUsuario%>
	</font></b>
	</div>
</body>
</html>
