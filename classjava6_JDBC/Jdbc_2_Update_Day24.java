package classjava6_JDBC;

import java.sql.*;

public class Jdbc_2_Update_Day24 {

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
			PreparedStatement pst = con.prepareStatement("INSERT INTO employees(EmpId,EmpName,EmpLocation,EmpSalary) values(?,?,?,?) ");
			pst.setInt(1,1);
			pst.setString(2, "Surya");
			pst.setString(3, "Triplicane");
			pst.setFloat(4, 54000.35f);
			
			int rows=pst.executeUpdate();
			System.out.println(rows +" rows inserted");
		    
			// 6. close Resources
			pst.close();
			con.close();
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
