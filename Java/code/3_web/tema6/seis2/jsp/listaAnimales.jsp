<%@ page import="java.sql.ResultSet;" %>
<html>
<head>
	<title>Lista animales</title>
</head>
<body>
	<h3><p align="center">Lista de animales</p></h3>
	<p>&nbsp;</p>
	<center>
	<h2>Antes del commit</h2>
	<table width="200" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
	<tr>
		<th>ID</td>
		<th>Especie</td>
		<th>Tipo</td>
		<th>Nombre</td>
		<th>Edad</td>
	</tr>
	<%
		ResultSet rs = (ResultSet)session.getAttribute("antes");
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

	Resultados:<br>
	<%
		int [] res = (int[])session.getAttribute("resultados");
		for (int i=0 ; i<res.length ; i++) {
	%>
		iter = <%=res[i]%><br>
	<%
		}
	%>

	<h2>Despu&eacute;s del commit</h2>
	<table width="200" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
	<tr>
		<th>ID</td>
		<th>Especie</td>
		<th>Tipo</td>
		<th>Nombre</td>
		<th>Edad</td>
	</tr>
	<%
		ResultSet rs2 = (ResultSet)session.getAttribute("despues");
		while(rs2.next()) {
	%>
	<tr>
		<td><%=rs2.getInt(1)%></td>
		<td><%=rs2.getInt(2)%></td>
		<td><%=rs2.getInt(3)%></td>
		<td><%=rs2.getString(4)%></td>
		<td><%=rs2.getInt(5)%></td>
	</tr>      
	<%
		}
	%>
	</table>
</body>
</html>
