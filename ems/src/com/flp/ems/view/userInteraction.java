package com.flp.ems.view;
import com.flp.ems.util.Validate;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class userInteraction {
	void AddEmployee(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("name of the employee");
		String name=sc.next();
		
		
		System.out.println("kin_id of employee");
		int kin_id=sc.nextInt();
		
		
		System.out.println("email_id of employee");
		String email_id = sc.next();


		System.out.println("address of employe");
		String address=sc.next();
		
		
		System.out.println("phone no of employee");
		int phone_no=sc.nextInt();
		
			String date = sc.next();
			System.out.println("date of birth ");
		
		

			String join = sc.next();
			System.out.println("date of joining ");	
	
		
		
		System.out.println("department of employee");
		String department=sc.next();
		
		
		
		
		
		System.out.println("project of employee");
		String  project=sc.next();
		
		
		
		System.out.println("role of employee");
		String role=sc.next();
		HashMap hm=new HashMap();
		if(Validate.ValidateDate(date) && Validate.ValidateDate(join))
		{    
			hm.put(1, name);
			hm.put(2, kin_id);
			hm.put(3, email_id);
			hm.put(4, address);
			hm.put(5, phone_no);
			hm.put(6, date);
			hm.put(7, join);
			hm.put(8, department);
			hm.put(9, project);
			hm.put(10, role);
			
			
			
		
	}
	}
	void ModifyEmployee(){
		
	}
 void RemoveEmployee(){
	 
	 
 }
 void SearchEmployee(){
	 
 }
void getAllEmployee(){
	
}
}

