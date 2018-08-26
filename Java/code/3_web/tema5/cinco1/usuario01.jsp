<%
  String nombreUsuario = request.getParameter("nombre");
%>
<html>
<head>
	<title>Validacion del usuario</title>
</head>
<body bgcolor="#FFFFFF" text="#000000">
	<div align="center">
		<b>
		<font face="Arial, Helvetica, sans-serif" size="+3">
		Bienvenido <%=nombreUsuario%>
		<jsp:useBean id="mibean" class="cinco1.beans.MiBeanParaJsp" scope="session" />
		<jsp:setProperty name="mibean" property="nombreUsuario" value="<%=nombreUsuario%>" />
		</jsp:useBean>
		<form action="usuario02.jsp">
			<a href="usuario02.jsp">Liga al segundo JSP</a> 
		</form>
		</font>
		</b>
	</div>
</body>
</html>
