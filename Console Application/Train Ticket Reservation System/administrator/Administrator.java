package railway.administrator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import railway.database.DataAdd;

public class Administrator {

	static Scanner SC = new Scanner(System.in);

	private void allocatingTrain() {

		ArrayList<Train> trainList = new ArrayList<>();
		System.out.print("Enter number of Trains : ");
		byte trainCount = SC.nextByte();
		for (int count = 0; count < trainCount; count++) {
			TrainDetails td = new TrainDetails();
			trainList.add(td.getTrainDetail());
		}
		if(! trainList.isEmpty()) {
			DataAdd addData = new DataAdd();
			addData.setDetails(trainList);
		} else {
			System.out.println("Train list is empty.");
		}
	}

	private void allocatingTickets() {

		System.out.println("Dear admin please give minimum 15 tickets.");
		boolean validation = true;
		int tickets = 0;
		while (validation) {
			try {
				System.out.print("Enter number of tickets : ");
				tickets = SC.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Give your input as a Numeric value.");
				SC.next();
			}
			validation = false;
			splitTickets(tickets);
		}
	}
	
	private void splitTickets(int ticketCount) {
		
		int avlUpperBerth = ;
		int avlMiddleBerth = ;
		int avlLowerBerth = ;
		int avlSideUpperBerth = ;
		int avlSideLowerBerth = ;
		int avlRAC = avlSideLowerBerth * 2;
		int avlWL = avlRAC / 2;
	}

	public void adminMenu() {

		boolean adValidation = true;
		while (adValidation) {
			System.out.print("Enter your Username : ");
			String userName = SC.next();
			System.out.print("Enter your Password : ");
			String password = SC.next();
			String dummy = "admin";
			if (userName.equals(dummy) && password.equals(dummy)) {
				while (adValidation) {
					try {
						System.out.println("Admin Menu");
						System.out.println("1. Train Allocation");
						System.out.println("2. Ticket Allocatioin.");
						System.out.println("3. Chart Preparation.");
						System.out.println("4. Back.");
						System.out.print("Enter your choice : ");
						byte adChoice = SC.nextByte();
						switch (adChoice) {
						case 1 -> {
							allocatingTrain();
						}
						case 2 -> {
							allocatingTickets();
						}
						case 3 -> {

						}
						case 4 -> {
							System.out.println("Thank You Admin.");
							adValidation = false;
						}
						default -> System.out.println("Enter the correct option.");
						}
					} catch (InputMismatchException e) {
						System.err.println("Give your input as a Numeric value.");
						SC.next();
					}
				}
			} else {
				System.out.println("Username or Password is wrong.");
			}
		}
	}
}