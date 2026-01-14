package classjava6_JDBC;

import java.sql.*;

public class Jdbc1Day24 {

	public static void main(String[] args) {
		try {
			// 1. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Create Connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb",
					"root",
					"Yuva@1603");
			
			// 3. Create Statement
			PreparedStatement pst = con.prepareStatement("SELECT * FROM employees");
			
			// 4. Execute Query
			ResultSet rs=pst.executeQuery();
			
			// 5. Process Results
			while(rs.next()) {
				System.out.println(rs.getInt("EmpId")+" "+rs.getString("EmpName")+" "+rs.getString("EmpLocation")+" "+rs.getFloat("EmpSalary"));
			}
			
			// 6. Close resources
			rs.close();
			pst.close();
			con.close();
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
