import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;

public class SeleccionaUsuarios extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                HttpSession session = req.getSession(true);
		ResultSet rs;
                PrintWriter pw = res.getWriter();
                //String userid = (String)session.getAttribute("userid");
                try{
                    	ConexionBD dbc = new ConexionBD();
                    	rs = dbc.seleccionar("select * from usuarios");
			pw.println("<html>");
		        pw.println("<head>");
		        pw.println("</head>");
		        pw.println("<body>");
			pw.println("<CENTER>");
			if (rs != null) {
				pw.println("<TABLE>");
				pw.println("<TR><TH>ID</TH><TH>Usuario</TH><TH>Contra</TH></TR>");
				while(rs.next()) {
					pw.println("<TR><TD>" + rs.getInt("id")
							+"</TD><TD>" + rs.getString("usr")
							+ "</TD><TD>" + rs.getString("passwd")
							+"</TD></TR>");
				}
				pw.println("<TABLE>");
			} else {
				pw.println("Error al acceder a la Base de Datos.");
			}
			pw.println("</CENTER>");
			pw.println("</body>");
                        pw.println("</html>");
                } catch(Exception e){}
	}
}
