<html>
<body>
	<% String s = s1+s2; %>	<- No se ha definido la variable s2
	<%! String s1 = "hello"; %><- Variable s1
	<% String s2 = "world"; %><- Variable s2
	<% out.print(s); %>
</body>
</html>
