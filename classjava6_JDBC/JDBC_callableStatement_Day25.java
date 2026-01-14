package classjava6_JDBC;

import java.sql.*;

public class JDBC_callableStatement_Day25 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/testDb";
	static final String USER = "root";
	static final String PASS = "Yuva@1603";
	
	public static void main(String[] args) {
		try 
		{
			Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
			String stmt="insert into employees values (?,?,?,?)";
				CallableStatement cs=con.prepareCall(stmt);
			cs.setInt(1, 119); // 1 Specifies the First Parameter in the QUery
			cs.setString(2, "Ratani");
			cs.setString(3,"Chennai");
			cs.setFloat(4,52000f);
			cs.execute();
			System.out.println("Uploaded Successfully \n");			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
