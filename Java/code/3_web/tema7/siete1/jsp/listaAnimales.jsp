<%@ page import="java.sql.ResultSet;" %>
<html>
<head>
	<title>Lista animales</title>
</head>
<body>
	<h3><p align="center">Lista de animales</p></h3>
	<p>&nbsp;</p>
	<table width="200" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
	<tr>
		<th>ID</td>
		<th>Especie</td>
		<th>Tipo</td>
		<th>Nombre</td>
		<th>Edad</td>
	</tr>
	<%
		ResultSet rs = (ResultSet)session.getAttribute("datos");
		while(rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt(1)%></td>
		<td><%=rs.getInt(2)%></td>
		<td><%=rs.getInt(3)%></td>
		<td><%=rs.getString(4)%></td>
		<td><%=rs.getInt(5)%></td>
	</tr>      
	<%
		}
	%>
	</table>
</body>
</html>
 

