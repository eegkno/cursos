package bd;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Savepoint;

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

        public int[] actualizar () throws SQLException {
		int [] res = new int[2];
	        try {
			//int num = 5;
                	stm = conn.createStatement();
			// Se desactiva auto-commit
			conn.setAutoCommit(false);
			// se realiza una actualizaciOn
			PreparedStatement act1 = conn.prepareStatement("UPDATE animal SET nombre = ? WHERE id = ?");
			act1.setString(1, "Tiger...");
			act1.setInt(2, 3);
			res[0] = act1.executeUpdate();

			// Se realiza otra actualizaciOn
			PreparedStatement act2 = conn.prepareStatement("UPDATE animal SET nombre = ? WHERE id = ?");
			act2.setString(1, "Venaditou");
			act2.setInt(2, 1);
			res[1] = act2.executeUpdate();

			for (int i=0 ; i<res.length ; i++)
				System.out.println("res[" + i + "] = " + res[i]);

			// se ejecutan las consultas
			conn.commit();

			// se vuelve a activar auto-commit
			conn.setAutoCommit(true);
        	} catch(Exception e) {
                       System.out.println("--------------------------------------------------------------------------");
                       System.out.println("EXCEPCIoN GENERADA");
                       System.out.println(e.toString());
                       System.out.println("--------------------------------------------------------------------------");
                }
		return res;
	}
        
        public int[] insertar() throws SQLException {
		int [] res = new int[2];
	        try {
			//int num = 5;
                	stm = conn.createStatement();
			// Se desactiva auto-commit
			conn.setAutoCommit(false);

			res[0] = stm.executeUpdate("INSERT INTO animal (id_especie,id_tipo,nombre,edad) VALUES ('4','4','Gema','5')");

			// Se salva un punto especIfico
			Savepoint sp = conn.setSavepoint("SAVEPOINT_1");
			// Se genera otra inserciOn
			res[1] = stm.executeUpdate("INSERT INTO animal (id_especie,id_tipo,nombre,edad) VALUES ('4','4','Dorado','2')");

			// Se hace un rollback hasta el punto de salvamento
			conn.rollback(sp);

			for (int i=0 ; i<res.length ; i++)
				System.out.println("res[" + i + "] = " + res[i]);

			// se ejecutan las consultas
			conn.commit();

			// se vuelve a activar auto-commit
			conn.setAutoCommit(true);
        	} catch(Exception e) {
                       System.out.println("--------------------------------------------------------------------------");
                       System.out.println("EXCEPCIoN GENERADA");
                       System.out.println(e.toString());
                       System.out.println("--------------------------------------------------------------------------");
                }
		return res;
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
