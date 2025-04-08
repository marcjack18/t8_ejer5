package t8_ejer5;
import java.sql.*;
public class ConnectionSingleton {
private static Connection con;

public static Connection getConnection() throws SQLException{
	String url="jdbc:mysql://127.0.0.01:3307/gestion_tienda";
	String user="alumno";
	String password="alumno1234";
	if(con == null || con.isClosed()) {
		con=DriverManager.getConnection(url,user,password);
	}
	
	return con;
}
}

