import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
	public static void main (String [] args){
		try {
			// puente JDBC -> MySQL
			Class.forName("com.mysql.jdbc.Driver");
			// ConexiOn a la base de datos
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prb","root","");
			System.out.println("ConexiOn con la BD establecida");
		}catch (SQLException e){
			System.out.println("Error al realizar la conexiOn con mysql");
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
