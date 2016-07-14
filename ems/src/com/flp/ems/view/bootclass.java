package com.flp.ems.view;
import java.util.Scanner;


public class bootclass {
	private static final int Employee = 0;
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in) ;
		System.out.println("AddEmployee");
		System.out.println("ModifyEmployee");
		System.out.println("RemoveEmployee");
		System.out.println("SearchEmployee");
		System.out.println("getAllEmployee");
		int s=scanner.nextInt();
		
	}
	
	
	
	
	void menuSelection (int s){
		switch(Employee)
		{
		case 1:
			userInteraction u1=new userInteraction();
		u1.AddEmployee();
		break;
		case 2:
			userInteraction u2=new userInteraction();
		u2.ModifyEmployee();
		break;
		case 3:
			userInteraction u3=new userInteraction();
		u3.RemoveEmployee();
		break;
		case 4:
			userInteraction u4=new userInteraction();
		u4.SearchEmployee();
		break;
		case 5:
			userInteraction u5=new userInteraction();
		u5.getAllEmployee();
		break;
		default: System.out.println("value is default");
		break;
		
		
		
		
		}
	

}
	
}
	
	
	
