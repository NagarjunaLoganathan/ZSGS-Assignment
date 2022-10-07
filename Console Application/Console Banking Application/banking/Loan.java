package zsgs.banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loan {
	
	Scanner scan = new Scanner(System.in);

	private void getEducationLoan() {
		
	}
	
	private void getGoldLoan() {
		
	}
	
	private void getHousingLoan() {
		
	}
	
	private void getPersonalLoan() {
		
	}
	
	public void getLoan() {
		System.out.println("+---------------------+");
		System.out.println("|      LOAN MENU      |");
		System.out.println("+---+-----------------+");
		System.out.println("| 1 | Education Loan. |");
		System.out.println("| 2 | Gold Loan.      |");
		System.out.println("| 3 | Housing Loan.   |");
		System.out.println("| 4 | Personal Loan.  |");
		System.out.println("| 5 | Back.           |");
		System.out.println("+---+-----------------+");
		boolean validation = true;
		while(validation) {
			byte choice = 0;
			try {
				System.out.print("Enter your choice : ");
				choice = scan.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Enter 'Numeric' values only.");
				scan.next();
			}
			switch(choice) {
			case 1 -> getEducationLoan();
			case 2 -> getGoldLoan();
			case 3 -> getHousingLoan();
			case 4 -> getPersonalLoan();
			case 5 -> validation = false;
			default -> System.out.println("Enter the above obtions only.");
			}
		}
	}
}