import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {
	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		try {
		    reader=new FileReader("db.properties");
		     prop=new Properties();
			prop.load(reader);
			
			//load driver
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver Loaded.............");
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//get DBConnection
		try(Connection con=
				DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
						prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				System.out.println("userid:"+rs.getInt(1));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("email:"+rs.getString(3));
				System.out.println("************************************");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
