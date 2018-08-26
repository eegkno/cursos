<html>
<body>
	Usando pi = <%=pi%>, el &aacute;rea de un c&iacute;rculo<br>
	con radio 3 es <%=area(3)%>
	<%!
		double area(double r) {
			return r*r*pi;
		}
	%>
	<%! final double pi=3.14159; %>
</body>
</html>


