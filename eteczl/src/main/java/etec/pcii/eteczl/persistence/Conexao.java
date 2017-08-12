package etec.pcii.eteczl.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection getMysqlConnection()throws Exception{
		String stringConnection = "jdbc:mysql://localhost:3306/escola";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(stringConnection, "root", "");
		System.out.println(conn);
		return conn;
	}
	
}                        
