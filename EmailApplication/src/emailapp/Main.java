package emailapp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String fname = input.next();
		System.out.println("Enter last name:");
		String lname = input.next();
		
		Email em1 = new Email(fname, lname);
		
		int choice = -1;
		do {
			System.out.println("\n*****\nEnter your choice\n1.Show info\n2.Change password\n3.Changr mailbox capacity\n4Set alternate mail\n5.Exit");
		choice = input.nextInt();
		switch(choice) {
		case 1:
			em1.getInfo();
		case2:
			em1.set_password();
		case 3:
			em1.set_mail();
		case 4:
			em1.alternative_email();
			break;
		case 5:
			System.out.println("Thank you for using the application");
			break;
			default :
				System.out.println("Invalid input\n Enter valid input");
		}
		}while(choice != 5);
	
	
		// TODO Auto-generated method stub

	}

}
