package classjava6_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBC_CallableStatement2Day25 {

		static final String DB_URL = "jdbc:mysql://localhost:3306/store_procedure";
		static final String USER = "root";
		static final String PASS = "Yuva@1603";
		
		public static void main(String[] args) {
			try 
			{
				Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
				
					CallableStatement cs=con.prepareCall("{call get_cars_stats_by_year(?,?,?,?,?)}");
					cs.setInt(1, 2017);
					cs.registerOutParameter(2, Types.INTEGER);
					cs.registerOutParameter(3, Types.DECIMAL);
					cs.registerOutParameter(4, Types.DECIMAL);
					cs.registerOutParameter(5, Types.DECIMAL);
					cs.execute();
					
					int make= cs.getInt(2);
					System.out.println("Make Count is "+make);
				
					float min=cs.getFloat(3);
					System.out.println("Min value is "+min);
					
					float avg=cs.getFloat(4);
					System.out.println("Avg Value is "+avg);
					
					float max=cs.getFloat(5);
					System.out.println("Max Value is "+max);
					
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}


