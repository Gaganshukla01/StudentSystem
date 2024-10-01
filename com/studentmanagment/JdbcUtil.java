package com.studentmanagment;
import java.sql.*;

public class  JdbcUtil {
	
	static Connection con;
	public static Connection createcon() {
		try {
			String url = "jdbc:mysql://localhost:3306/student_managment";
		    String user = "root";
		     String password = "Password@2024";
		     
//		     loader
		     con=DriverManager.getConnection(url,user,password);
		     
		}
		
		catch (Exception e){
			e.printStackTrace();	
		}
		
		return con;
	}
	
	

}
