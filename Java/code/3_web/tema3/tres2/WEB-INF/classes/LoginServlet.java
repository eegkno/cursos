import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion, respuesta);
	}

	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		String userid = peticion.getParameter("userid");
                respuesta.sendRedirect("http://127.0.0.1:8080/tres2/servlet/AccountServlet?userid="+userid);

	}

}
