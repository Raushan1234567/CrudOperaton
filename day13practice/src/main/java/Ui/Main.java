package Ui;


import java.util.Scanner;

import Dao.Imple;
import Dao.Inter;
import Dto.Student;


public class Main {
	
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	int c;
	do {
		System.out.println("1. Insert Student Details");
		System.out.println("2. Update Student Details");
		System.out.println("3. Delete Student Details");
		System.out.println("4. Find  Student Details By Id");
		System.out.println("5. Exit");
		
		c=sc.nextInt();
		
		switch(c) {
		case 1:
			InsertUi(sc);
			break;
		case 2: UpdateUi(sc);
			break;
		case 3:DeleteUi(sc);
			break;
		case 4: SearchUi(sc);
			break;
		case 0:
			System.out.println("thanks visit again");
			break;
			default : 
				System.out.println("Invalid salection");
				break;
		}
		
		
	}while(c!=0);
	sc.close();
}

 static void InsertUi(Scanner sc) {

	 System.out.println("Enter Email");
	 String email=sc.next();
	 System.out.println("Enter Address");
	 String address=sc.next();
	 System.out.println("Enter Course");
	 String course=sc.next();
	 System.out.println("Enter Level");
	 int level=sc.nextInt();
	 
	 Student stu=new Student(email,address,course,level);
	  
	 Inter ina=new Imple();
	 try {
	 ina.saveStudent(stu);
	 System.out.println("Added successfully");
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
}

 static void UpdateUi(Scanner sc) {
	 System.out.println("Enter id");
	 int id=sc.nextInt();
	 System.out.println("Enter Level");
	 int level=sc.nextInt();
	 
		 
	 Inter ina=new Imple();
	 
	 try {
	 ina.updateStudentLevel(id, level);
	 System.out.println("updated Successfully");
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
	
}

 static void DeleteUi(Scanner sc) {
	 System.out.println("Enter id");
	 int id=sc.nextInt();
	 
	 Inter a=new Imple();
	 
	 try {
	 a.deleteStudentById(id);
	 System.out.println("Deleted successfully");
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	
}

 static void SearchUi(Scanner sc) {
	
	 System.out.println("Enter id");
	 int id=sc.nextInt();
	 
	 Inter a=new Imple();
	 
	 try {
	 Student s1=a.findStudentById(id);
	 System.out.println(s1);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	
}

}
