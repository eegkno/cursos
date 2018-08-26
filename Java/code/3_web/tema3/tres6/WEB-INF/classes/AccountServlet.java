import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class AccountServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userid = (String) req.getAttribute("userid");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>El nombre de usuario enviado a LoginServlet y<br>");
		pw.println(" reenviado a AccountServlet es: "+userid+"</h3><p>");
		pw.println("</body>");
		pw.println("</html>");
      }
}
