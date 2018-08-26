import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class TestServlet extends HttpServlet {
	String driverClassName = "";
	String dbURL = "";
	String bd = "";
	String username = "";
	String password = "";

	public void init(ServletConfig config) {
		driverClassName = config.getInitParameter("driverclassname");
           	dbURL = config.getInitParameter("dburl");
           	bd = config.getInitParameter("bd");
           	username = config.getInitParameter("username");
           	password = config.getInitParameter("password");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
                try {
                    go(request,response);
                } catch(Exception e) {
                        System.out.println("Excepcion generada" + e);
                }
        }

        public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
                try {
                    go(request,response);
                } catch(Exception e) {
                        System.out.println("Excepcion generada" + e);
                }
        }
        
         public void go(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                PrintWriter pw = response.getWriter(); 
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
                pw.println("driverClassName = "+driverClassName+"<p>");
                pw.println("dbURL ="+dbURL+"<p>");
                pw.println("bd ="+bd+"<p>");
                pw.println("username ="+username+"<p>");
                pw.println("password ="+password+"<p>");
                pw.println("</body>");
		pw.println("</html>");
	}
}
