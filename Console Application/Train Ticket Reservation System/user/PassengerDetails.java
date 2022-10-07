package railway.user;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PassengerDetails extends Enumurator {

	static Scanner SC = new Scanner(System.in);
	boolean validation = true;

	private String getPassengerName(int check) {

		String passengerName = null;
		while (validation) {
			if (check == 0) {
				System.out.print("Enter Passenger Name : ");
			} else {
				System.out.print("Enter Child Name : ");
			}
			passengerName = SC.nextLine();
			validation = (InputValidation.validatingName(passengerName)) ? false : true;
		}
		validation = true;
		return passengerName;
	}

	private byte getPassengerAge(int check) {

		byte passengerAge = 0;
		while (validation) {
			if (check == 0) {
				System.out.print("Enter passenger Age : ");
			} else {
				System.out.print("Enter Child Age : ");
			}
			try {
				passengerAge = SC.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Give your input as a Numeric value.");
				SC.next();
			}
			validation = (InputValidation.validatingAge(passengerAge, check)) ? false : true;
		}
		validation = true;
		return passengerAge;
	}

	private Gender getPassengerGender(int check) {

		char gender = 0;
		Gender passengerGender = null;
		while (validation) {
			if (check == 0) {
				System.out.print("Enter passenger Gender [F or M or O] : ");
			} else {
				System.out.print("Enter child Gender [F or M] : ");
			}
			gender = SC.next().toUpperCase().charAt(0);
			validation = (InputValidation.validatingGender(gender)) ? false : true;
		}
		switch (gender) {
		case 'F' -> passengerGender = Gender.F;
		case 'M' -> passengerGender = Gender.M;
		case 'O' -> passengerGender = Gender.O;
		}
		validation = true;
		return passengerGender;
	}

	private Berths getPassengerBerth() {

		String berth = null;
		Berths passengerBerth = null;
		while (validation) {
			System.out.println("Enter passenger Prefered Berth [U or M or L or SU or SL] : ");
			berth = SC.next().toUpperCase();
			validation = (InputValidation.validatingBerth(berth)) ? false : true;
		}
		switch (berth) {
		case "U" -> passengerBerth = Berths.U;
		case "M" -> passengerBerth = Berths.M;
		case "L" -> passengerBerth = Berths.L;
		case "SU" -> passengerBerth = Berths.SU;
		case "SL" -> passengerBerth = Berths.SL;
		}
		validation = true;
		return passengerBerth;
	}

	public Passenger getDetails() {

		Passenger p = new Passenger();

		p.setName(getPassengerName(0));
		p.setAge(getPassengerAge(0));
		p.setGender(getPassengerGender(0));
		if (p.getGender().equals(Gender.F)) {
			while (validation) {
				try {
					System.out.println("Are you travel with your child ?");
					System.out.println("1. Yes.\n2. No.");
					System.out.print("Enter your choice : ");
					byte childChoice = SC.nextByte();
					if (childChoice == 1) {
						p.setChildName(getPassengerName(1));
						p.setChildAge(getPassengerAge(1));
						p.setChildGender(getPassengerGender(1));
					}
				} catch (InputMismatchException e) {
					System.err.println("Give your input as a Numeric value.");
					SC.next();
				}
				validation = false;
			}
			validation = true;
		}
		p.setPreferedBerth(getPassengerBerth());

		return p;
	}
}