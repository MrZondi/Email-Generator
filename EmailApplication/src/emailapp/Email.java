/**
 * 
 */
package emailapp;
import java.util.*;
import java.io.*;


/**
 * @author Sbulelo
 *
 */
public class Email {
	
	public Scanner _input = new Scanner(System.in);
	
	//email attributes
	private String _fname;
	private String _lname;
	private String _dept;
	private String _email;
	private String _password;
	private int _capacity = 500;
	private String _alteremail;
	
	/**
	 * 
	 * @param fname takes in first name
	 * @param lname takes in last name
	 */
	public Email(String fname, String lname) {
		_fname = fname;
		_lname = lname;
		
		System.out.print("New Employee: " + _fname + " " + _lname);
		
		this._dept = this.setDept();
		this._password = this.generate_password(8);
		this._email = this.generate_email();
		
	}
	
	//generate email method
	private String generate_email() {
		return _fname.toLowerCase() + "." + _lname.toLowerCase() + "@" + _dept.toLowerCase() + ".com";
	}
	
	//set department
	private String setDept(){
		System.out.println("\nAsign Department by code \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
		
		boolean flag = false;
		
		do {
			System.out.println("Enter Department code");
			
			int _choice = _input.nextInt();
			
			switch(_choice){
			case 1:
				return "Sales";
			case 2:
				return "Development";
			case 3:
				return "Accounting";
			case 0:
				return "None";
				default:
					System.out.print("Invalid choice please choose it again");
			}
		}while(!flag);
		return null;
	}
	
	//generate random password
	private String generate_password(int length) {
		Random  _random= new Random();
		
		String _capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String _small_chars = "abcdefghijklmnopqrstuvwxyz";
		String _numbers = "0123456789";
		String _symbols = "!@#$%^&*?";
		String _values = _capital_chars + _small_chars + _numbers + _symbols;
		String _password = "";
		
		for (int i = 0; i < length; i++) {
			_password = _password + _values.charAt(_random.nextInt(_values.length()));		
		}
		return _password;
	}
	//change password
	public void set_password() {
		boolean flag = false;
		do {
			System.out.println("Do you want to change your password? (Y/N)");
			char choice = _input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				flag = true;
				System.out.println("Enter current password: ");
				String temp = _input.next();
				if (temp.equals(this._password)) {
					System.out.println("Enter new password:");
					this._password = _input.next();
					System.out.println("Password changed succefully");
				}else {
				System.out.println("Password incorret");
			}
			}else if (choice == 'N' || choice == 'n') {
				flag = true;
				System.out.println("Password change option cancelled!");
			}else {
				System.out.println("Enter valid choice");
			}
		}while(!flag);
		
	}
	
	//set mailbox capacity
	public void set_mail() {
		System.out.println("Current capacity = "+ this._capacity +"mb");
		System.out.println("Enter new mailbox capacity: ");
		this._capacity = _input.nextInt();
		System.out.println("Mailbox capacity changed");
	}
//set alternative email
	public void alternative_email() {
		System.out.println("Enter new alternate mail:");
		this._alteremail = _input.next();
		System.out.println("Alternative email set");
	}
	//Display user information
	public void getInfo() {
		System.out.println("New user: " +this._fname + " "+this._lname);
		System.out.println("Department: " + this._dept);
		System.out.println("Email: "  + _email);
		System.out.println("Passwod: "+ this._password);
		System.out.println("Mailbox capacity: " + this._capacity+"mb");
		System.out.println("Alternate mail: "+ this._alteremail);
	}
}
