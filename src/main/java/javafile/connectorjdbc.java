
package javafile;

import java.sql.*;
import java.io.*;

public class connectorjdbc {
	
	
	public static  Connection getcon() throws SQLException , IOException, ClassNotFoundException  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String  url="jdbc:mysql://localhost:3306/inventory_db";
			 String  user="root";
			 String pass="shanu03";
			Connection conn=DriverManager.getConnection(url, user, pass);
			return conn;
	}
}
