import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class TestServlet extends HttpServlet {
	String driverClassName 	= "";
	String dbURL 		= "";
	String username 	= "";
	String password 	= "";

	public void init(ServletConfig config) {
           	ServletContext sc = config.getServletContext();
		driverClassName = sc.getInitParameter("driverclassname");
           	dbURL 		= sc.getInitParameter("dburl");
           	username 	= sc.getInitParameter("username");
           	password 	= sc.getInitParameter("password");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
                throws IOException, ServletException {
		try {
                    go(request,response);
                } catch(Exception e) {
                        System.out.println("Excepcion generada" + e);
                }
        }

        public void doPost(HttpServletRequest request,HttpServletResponse response)
                throws IOException, ServletException {
                try {
                    go(request,response);
                } catch(Exception e) {
                        System.out.println("Excepcion generada" + e);
                }
        }
        
         public void go(HttpServletRequest request,HttpServletResponse response)
                throws IOException, ServletException {
                PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>driverClassName: "+driverClassName+"</h3><p>");
		pw.println("<h3>dbURL: "+dbURL+"</h3><p>");
		pw.println("<h3>username: "+username+"</h3><p>");
		pw.println("<h3>password: "+password+"</h3><p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
