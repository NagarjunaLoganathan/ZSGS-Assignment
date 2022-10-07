package railway.management;

import java.util.InputMismatchException;
import java.util.Scanner;

import railway.administrator.Administrator;
import railway.user.User;

public class RailwayBoard {

	private void management() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Welcome to Ticket Reservation");
				System.out.println("1. Administrator.");
				System.out.println("2. Passenger or User.");
				System.out.println("3. Exit.");
				System.out.print("Enter your choice : ");
				byte choice = scan.nextByte();
				switch (choice) {
				case 1 -> {
					Administrator admin = new Administrator();
					admin.adminMenu();
				}
				case 2 -> {
					User user = new User();
					user.userMenu();
				}
				case 3 -> {
					System.out.println("Thank You...!");
					System.exit(1);
				}
				default -> System.out.println("Enter the correct option.");
				}
			} catch (InputMismatchException e) {
				System.err.println("Give your input as a Numeric value.");
				scan.next();
			}

		}
	}

	public static void main(String[] args) {

		RailwayBoard rb = new RailwayBoard();
		rb.management();
	}
}