import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class AccountServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        	HttpSession session = req.getSession(true);
                PrintWriter pw = res.getWriter();
                String userid = (String)session.getAttribute("userid");
                if(userid==null){
               		pw.println("<html>");
		        pw.println("<head>");
		        pw.println("</head>");
		        pw.println("<body>");
		        pw.println("<h3>sesion inv&aacute;lida !!!</h3><p>");
		        pw.println("</body>");
                        pw.println("</html>");
                }else{
                       	pw.println("<html>");
		        pw.println("<head>");
		        pw.println("</head>");
		        pw.println("<body>");
		        pw.println("<h3>nombre de usuario: "+ userid +"</h3><p>");
		        pw.println("</body>");
                        pw.println("</html>");
               	}
      	}
}
