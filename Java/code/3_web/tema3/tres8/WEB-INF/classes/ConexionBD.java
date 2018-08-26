import java.sql.*;
import java.io.*;

public class ConexionBD {
        private Connection conn;
        private Statement sqlStatement;
        private ResultSet rs;
        private ResultSetMetaData rsmd;
        private Statement stm = null;
        private static String sql=null;
        private int reng=0;
        private int icolumna;
        private int rengAfectados = 0;

        public ConexionBD() {
              	try {
                  	Class.forName("com.mysql.jdbc.Driver");
                  	conn=DriverManager.getConnection("jdbc:mysql://localhost/prb","root","");
              	} catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
              	}
        }

        public void close() {
               try {
                  conn.close();
               } catch(SQLException e) {}
        }

        public ResultSet seleccionar(String sql) throws SQLException {
        	try {
               		sqlStatement = conn.createStatement();
               		rs = sqlStatement.executeQuery(sql);
			return rs;
		} catch(SQLException e) {
                	System.out.println("Error en select : "+e);
			return null;
		} catch(NullPointerException e) {
                	System.out.println("Error en select : "+e);
			return null;
          	}
	}

        public int insertar(String ssql) throws SQLException {
		rengAfectados = 0;
		System.out.println(ssql);
	        try {
                	stm = conn.createStatement();
        		rengAfectados = stm.executeUpdate(ssql);
        	} catch(Exception e) {
                       	System.out.println("--------------------------------------------------------------------------");
                       	System.out.println("EXCEPTION GENERADA");
                       	System.out.println(e.toString());
                       	System.out.println("--------------------------------------------------------------------------");
                }
		return rengAfectados;
	}

	public static void main (String [] a ) {
		try {
			new ConexionBD().insertar("INSERT INTO usuarios VALUES('','usuario','contra')");
		} catch (Exception e){}
	}
}
