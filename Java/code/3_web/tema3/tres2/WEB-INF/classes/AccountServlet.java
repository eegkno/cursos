import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AccountServlet extends HttpServlet {

	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion, respuesta);
	}

	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		String userid = (String) peticion.getParameter("userid");
                //String userid = (String)peticion.getAttribute("userid");
		PrintWriter pw = respuesta.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>cadena: "+userid+"</h3><p>");
		pw.println("</body>");
		pw.println("</html>");
      }
}
