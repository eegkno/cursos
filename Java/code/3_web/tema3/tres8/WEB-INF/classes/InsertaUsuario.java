import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InsertaUsuario extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                HttpSession session = req.getSession(true);
		int renglonesAfectados;
                PrintWriter pw = res.getWriter();
                //String userid = (String)session.getAttribute("userid");
                try{
                    	ConexionBD dbc = new ConexionBD();
                    	renglonesAfectados = dbc.insertar("INSERT INTO usuarios (usr,passwd) VALUES('jose','lito')");
			pw.println("<html>");
		        pw.println("<head>");
		        pw.println("</head>");
		        pw.println("<body>");
			pw.println("<CENTER>");
			if (renglonesAfectados > 0) {
				pw.println("El registro se insertO correctamente.");
			} else {
				pw.println("Error al insertar el registro.");
			}
			pw.println("</CENTER>");
			pw.println("</body>");
                        pw.println("</html>");
                } catch(Exception e){}
	}
}
