package com.studentmanagment;
import java.sql.*;
import java.util.*;

public class Studentdoa {
	
	public static boolean InsertstudentAtDb(Student st) {
		boolean f=false;
		try {
		Connection con=JdbcUtil.createcon();
		String q="insert into students(sname,sphone,scity) values(?,?,?)";
		
		PreparedStatement preparedstatment=con.prepareStatement(q);
		preparedstatment.setString(1, st.getStudentName());
		preparedstatment.setString(2, st.getStudentPhone());
		preparedstatment.setString(3, st.getStudentCity());
		
		preparedstatment.executeUpdate();
		f=true;
		
		
		}
		catch(Exception e) {
			
		}
		
		return f;
		
		
	}
	
	
	public static boolean DeleteStudentAtDb(int id) {
		boolean f=false;
		
		try {
			Connection con=JdbcUtil.createcon();
			String q="delete from students where sid=?";
			PreparedStatement preparedstatement=con.prepareStatement(q);
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
			f=true;
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	public static void Studentdisplay() {
		
		try {
			Connection con=JdbcUtil.createcon();
			String q="select * from students";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(q); 
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("Id: "+id);
				System.out.println("name: "+name);
				System.out.println("phone: "+phone);
				System.out.println("city: "+city);
				System.out.println("------------------------------");
			
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
