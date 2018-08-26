package bd;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionBD {
        private Connection conn;
        private Statement sqlStatement;
        private ResultSet rs;
        private ResultSetMetaData rsmd;
        private Statement stm = null;
        private static String sql=null;
        private int ren=0;

	public ConexionBD() {
        	try {
			Class.forName("com.mysql.jdbc.Driver");
                  	conn=DriverManager.getConnection("jdbc:mysql://localhost/zoo","root","");
              	} catch(Exception e) {
                  	System.out.println("Error: " + e.getMessage());
              	}
        }

        public void close() {
               	try {
               		conn.close();
               	} catch (SQLException e) { }
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
}
