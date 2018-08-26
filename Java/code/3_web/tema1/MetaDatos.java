import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaDatos {
	public static void main (String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prb","root","");
			System.out.println("ConexiOn con la BD establecida");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int cont = 1 ; cont <= cols ; cont++) {
				System.out.println(rsmd.getColumnName(cont) + "\t");
			}
		}catch (SQLException e){
			System.out.println("Error al realizar la conexiOn con mysql");
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
