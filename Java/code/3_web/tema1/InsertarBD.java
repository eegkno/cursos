import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertarBD {
	public static void main (String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prb","root","");
			System.out.println("ConexiOn con la BD establecida");
			// Se crea una instancia del tipo declaraciOn
			Statement stmt = con.createStatement();
			//int res = stmt.executeUpdate("INSERT INTO usuarios VALUES('','usuario','contra')");
			int res = stmt.executeUpdate("INSERT INTO usuarios VALUES('','" + args[0] + "','"+ args[1] + "')");
			if (res == 1){
				System.out.println("Registro insertado");
			} else {
				System.out.println("Registro no insertado");
			}
		}catch (SQLException e){
			System.out.println("Error al realizar la inserciOn en mysql");
			while (e != null){
				System.out.println("SQLState: " + e.getSQLState());
				System.out.println("Mensaje: " + e.getMessage());
				System.out.println("COdigo: " + e.getErrorCode());
				e.getNextException();
				System.out.println(" -------------------------------------- ");
			}
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
