package mubende.com;
import java.sql.*;
public class Connectivity {
static String DatabaseURL = "jdbc:mysql://localhost:3306/mubendesda";
static String pass = "#Tandy1997";
static String user= "root";
static Connection conn = null;
PreparedStatement stmt = null;

//Register driver
public static void main(String[] args) {
	

try{
Class.forName("com.mysql.jdbc.Driver");

//connect to database.
System.out.println("Connecting to database......");
conn = DriverManager.getConnection(DatabaseURL,user,pass);
}catch(SQLException e){
	System.out.println(e.getMessage());
}catch(Exception ex){
	System.out.println(ex.getMessage());
}

//Close connection
finally{
	if(conn!=null){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

}
}

