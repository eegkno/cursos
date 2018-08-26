import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Hashtable;

public class TestServlet extends HttpServlet {
	Hashtable<String,String> parameters = null;
	String driverClassName = "";
	String dbURL = "";
	String base = "";
	String username = "";
	String password = "";

	public void init(ServletConfig config) {
                ServletContext sc = config.getServletContext();
                parameters = (Hashtable<String,String>)sc.getAttribute("parameters");
                driverClassName = parameters.get("driverclassname");
                dbURL = parameters.get("dburl");
                base = parameters.get("base");
                username = parameters.get("username");
                password = parameters.get("Password");
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
		pw.println("<h3>base: "+base+"</h3><p>");
		pw.println("<h3>username: "+username+"</h3><p>");
		pw.println("<h3>password: "+password+"</h3><p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
