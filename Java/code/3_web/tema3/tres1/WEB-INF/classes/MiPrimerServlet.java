import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.io.IOException;

public class MiPrimerServlet extends HttpServlet {
	public void service(HttpServletRequest peticion, HttpServletResponse respuesta) 
				throws javax.servlet.ServletException, java.io.IOException {
		PrintWriter pw = respuesta.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<center>");
		pw.println("<h3>¡Mi primer Servlet!</h3><p>");				
		pw.println("</center>");
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
