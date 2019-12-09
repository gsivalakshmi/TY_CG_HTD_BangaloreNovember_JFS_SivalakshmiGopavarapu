import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv1 {
public static void main(String[] args) {
	FileReader reader=null;
	Properties prop=null;
	try {
	    reader=new FileReader("db2.properties");
	     prop=new Properties();
		prop.load(reader);
		
		//load driver
		Class.forName(prop.getProperty("driverClass"));
		System.out.println("Driver Loaded.............");
				
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	//get DBConnection
	//
}


}

