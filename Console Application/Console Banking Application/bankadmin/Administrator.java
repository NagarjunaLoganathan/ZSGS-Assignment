package zsgs.bankadmin;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import zsgs.banking.User;
import zsgs.database.CustomerDBManagement;

public class Administrator {

	static Scanner sc = new Scanner(System.in);

	private String adminId = "admin@zsgs.com";
	private String password = "Password";
	boolean validation = true;

	private void printAllCustomerDetails() {

		ArrayList<User> customerList = new ArrayList<User>();
		System.out.println("+------+");
		System.out.println("");
		System.out.println("+------+");
		for(User user : customerList) {
			
		}
	}

	private void printSpecificCustomerDetails() {

		User customer = null;
		short customerAccNo = 0;
		try {
			System.out.print("Enter your Account Number : ");
			customerAccNo = sc.nextShort();
		} catch (InputMismatchException e) {
			System.out.println("Enter 'Numeric' values only.");
		}
		customer = new CustomerDBManagement().fetchUserDetail(customerAccNo, 0);
		System.out.println("Customer Account Number : " + customer.getAccountNumber());
		System.out.println("Customer Name           : " + customer.getName());
		System.out.println("Customer Gender         : " + customer.getGender());
		System.out.println("Customer Contact Number : " + customer.getContactNumber());
		System.out.println("Customer Date of Birth  : " + customer.getDob());
		System.out.println("Customer PAN Number     : " + customer.getPan());
		System.out.println("Customer UPI ID         : " + customer.getUserName());
		System.out.println("Customer Password       : " + customer.getPassword());
		System.out.println("Customer UPI PIN        : " + customer.getUpiPin());
	}

	private void printCustomerPassbook() {

	}

	private void printCustomerLoanDetails() {

	}

	public void adminControl() {

		System.out.print("Enter your Admin ID : ");
		String userAdminId = sc.next();
		System.out.print("Enter your Password : ");
		String userPassword = sc.next();
		if (userAdminId.equals(adminId) && userPassword.equals(password)) {
			System.out.println("+--------------------------------------+");
			System.out.println("|             MANAGER MENU             |");
			System.out.println("+---+----------------------------------+");
			System.out.println("| 1 | Print All Customer Details.      |");
			System.out.println("| 2 | Print Specific Customer Details. |");
			System.out.println("| 3 | print Customer Passbook.         |");
			System.out.println("| 4 | Print Customers Loan Details.    |");
			System.out.println("| 5 | Log Out.                         |");
			System.out.println("+---+----------------------------------+");
			byte choice = 0;
			while (validation) {
				try {
					System.out.print("\nEnter your choice : ");
					choice = sc.nextByte();
				} catch (InputMismatchException e) {
					System.out.println("Enter 'Numeric' values only.");
					sc.next();
				}
				switch (choice) {
				case 1 -> printAllCustomerDetails();
				case 2 -> printSpecificCustomerDetails();
				case 3 -> printCustomerPassbook();
				case 4 -> printCustomerLoanDetails();
				case 5 -> {
					System.out.println("Admin Successfully Loged Out...!");
					validation = false;
				}
				default -> System.out.println("Enter the above options only.");
				}
			}
		} else {
			System.out.println("Your Admin ID or Password is wrong...!");
		}
	}
}