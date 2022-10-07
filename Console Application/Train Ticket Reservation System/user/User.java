package railway.user;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import railway.tickets.TicketBooking;

public class User {

	public void userMenu() {

		Scanner scan = new Scanner(System.in);
		boolean userValidation = true;
		while (userValidation) {
			try {
				System.out.println("User Menu");
				System.out.println("1. Book Ticket.");
				System.out.println("2. Cancel Ticket.");
				System.out.println("3. Booked Ticket Status.");
				System.out.println("4. Available Tickets.");
				System.out.println("5. Back.");
				System.out.print("Enter your choice : ");
				byte userChoice = scan.nextByte();
				switch (userChoice) {
				case 1 -> {
					ArrayList<Passenger> passengerList = new ArrayList<>();
					System.out.print("Enter number of Passengers : ");
					byte passengersCount = scan.nextByte();
					if(passengersCount > 0 && passengersCount <= 6) {
						for(int count = 0; count < passengersCount; count++) {
							PassengerDetails pd = new PassengerDetails();
							passengerList.add(pd.getDetails());
						}
						TicketBooking book = new TicketBooking();
						book.bookTicket(passengerList);
					} else {
						System.out.println("Please enter ticket count within 1 to 6.");
					}
				}
				case 2 -> {
					
				}
				case 3 -> {

				}
				case 4 -> {

				}
				case 5 -> {
					System.out.println("Thank you User.");
					userValidation = false;
				}
				default -> System.out.println("Enter the correct option.");
				}
			} catch (InputMismatchException e) {
				System.err.println("Give your input as a Numeric value.");
				scan.next();
			}
		}
	}
}