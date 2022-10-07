package zsgs.banking;

import java.util.HashSet;
import java.util.Scanner;

import zsgs.bankadmin.Administrator;

public class Menu {

	static Scanner SC = new Scanner(System.in);

	static HashSet<Long> contactCheck;
	static HashSet<String> panCheck;
	static HashSet<String> upiIdCheck;

	public Menu() {

		contactCheck = new HashSet<Long>();
		panCheck = new HashSet<String>();
		upiIdCheck = new HashSet<String>();
	}

	private void bank() {

		while (true) {
			try {
				System.out.println("+---------------------------+");
				System.out.println("|  Welcome to bank of ZSGS  |");
				System.out.println("+---+-----------------------+");
				System.out.println("| 1 | Manager.              |");
				System.out.println("| 2 | New User.             |");
				System.out.println("| 3 | Registered User.      |");
				System.out.println("| 4 | Exit.                 |");
				System.out.println("+---+-----------------------+");
				System.out.print("Enter your choice : ");
				byte choice = SC.nextByte();
				switch (choice) {
				case 1 -> {
					Administrator manager = new Administrator();
					manager.adminControl();
				}
				case 2 -> {
					NewUser newUser = new NewUser();
					newUser.creatAccount();
				}
				case 3 -> {
					RegisteredUser ru = new RegisteredUser();
					ru.checkUser();
				}
				case 4 -> {
					System.out.println("Thankyou for choosing Bank of ZSGS.");
					System.exit(1);
				}
				default -> System.out.println("Enter the above given options only.");
				}
			} catch (Exception e) {
				System.out.println(e);
				SC.next();
			}
		}
	}

	public static void main(String[] args) {

		Menu manage = new Menu();
		manage.bank();
	}
}