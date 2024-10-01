import java.util.*;

import com.studentmanagment.Student;
import com.studentmanagment.Studentdoa;

//import java.sql.*;

public class Start {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to student managment system");
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("Enter your choice");
			System.out.println("1 for Add");
			System.out.println("2 for Delete");
			System.out.println("3 for Display");
			System.out.println("4 for exit");
			int choice=sc.nextInt();
			
			switch(choice) 
			{
	
			case 1:
				
				System.out.println("Enter your name: ");
				sc.nextLine();
				String name=sc.nextLine();
				
				
				System.out.println("Enter your phone: ");
				String phone=sc.next();
				
				System.out.println("Enter your city: ");
				String city=sc.next();
				
				Student st=new Student(name,phone,city);
				
				System.out.println(st);
				boolean ans=Studentdoa.InsertstudentAtDb(st);
				
				if(ans) {
					System.out.println("Succesfully inserted::");
				}
				else {
					System.out.println("Not inserted::");
				}
				break;
				
				
			case 2:
				System.out.println("Enter id which you want to delete: ");
				int id=sc.nextInt();
				boolean a=Studentdoa.DeleteStudentAtDb(id);
				if(a) {
					System.out.println("Sucessfully Deleted");
				}
				else {
					System.out.println("Error occured while delete");
				}
				break;
				
				
			case 3:
				     Studentdoa.Studentdisplay();
				     break;
			case 4:
				break;
			default:
				System.out.println("Wrong input please try again ::");	
			}		

			System.out.println("Thanks for using student system");
		}
		
	}

	

}
