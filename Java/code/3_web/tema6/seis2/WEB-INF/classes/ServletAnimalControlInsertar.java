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

public class ServletAnimalControlInsertar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                HttpSession session = req.getSession(true);
                try {
			ConexionBD dbc = new ConexionBD();
                    	ResultSet rs = dbc.seleccionar("select * from animal");
			if (rs != null) {
				session.setAttribute("antes",rs);
                        } else {
                                System.out.println("No fue posible obtener los datos.");
				session.setAttribute("antes",null);
                        }

			int [] r = dbc.insertar();
			session.setAttribute("resultados",r);

                    	ResultSet rs2 = dbc.seleccionar("select * from animal");
			if (rs2 != null) {
				session.setAttribute("despues",rs2);
                        } else {
                                System.out.println("No fue posible obtener los datos.");
				session.setAttribute("despues",null);
                        }
                        dbc.close();
                 } catch (Exception e) {}
                req.getRequestDispatcher("/jsp/listaAnimales.jsp").forward(req, res);
	}
}
