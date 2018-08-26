import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeleccionarBD {
	public static void main (String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prb","root","");
			System.out.println("ConexiOn con la BD establecida");
			// Se crea una instancia del tipo declaraciOn
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
			System.out.println("ID\tUsuario\tContra");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("usr") + "\t" + rs.getString("passwd"));
			}
		}catch (SQLException e){
			System.out.println("Error al realizar la conexiOn con mysql");
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
