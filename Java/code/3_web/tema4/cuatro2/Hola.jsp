<%@ page errorPage="errorHandler.jsp" %>
<%-- Usando un scriptlet --%>
<%
	if (request.getParameter("nombre")==null) {
		throw new RuntimeException("Nombre no especificado");
	}
%>

<html>
<body>
	<br>
	<%-- Usando un expresion --%>
	<%=request.getParameter("nombre")%>!
</body>     
</html>


