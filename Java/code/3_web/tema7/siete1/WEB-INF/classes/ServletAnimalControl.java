package control;

import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bd.ConexionBD;
import javabean.AnimalBean;

public class ServletAnimalControl extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                HttpSession session = req.getSession(true);
                try {
			ConexionBD dbc = new ConexionBD();
                    	ResultSet rs = dbc.seleccionar("select * from animal");
			if (rs != null) {
				session.setAttribute("datos",rs);
                                /*System.out.println("ID\tEspecie\tTipo\tNombre\tEdad");
                                while(rs.next()) {
                                        System.out.println(rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4) + "\t"+ rs.getInt(5));
                                }*/
                        } else {
                                System.out.println("No fue posible obtener los datos.");
				session.setAttribute("datos",null);
                        }
                        dbc.close();
                 } catch (Exception e) { }
                req.getRequestDispatcher("/jsp/listaAnimales.jsp").forward(req, res);
	}
}
