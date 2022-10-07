package railway.administrator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrainDetails {

	static Scanner SC = new Scanner(System.in);
	boolean validation = true;

	private int getTrainNumber() {

		int trainNumber = 0;
		while (validation) {
			try {
				System.out.print("Enter Train Numbe : ");
				trainNumber = SC.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Give your input as a Numeric value.");
				SC.next();
			}
			validation = false;

		}
		validation = true;
		return trainNumber;
	}

	private String getTrain(int check) {

		if (check == 0) {
			String trainName = null;
			while (validation) {
				System.out.print("Enter Train Name : ");
				trainName = SC.next().toUpperCase();
				validation = (validatingString(trainName)) ? false : true;
			}
			validation = true;
			return trainName;
		} else {
			String trainType = null;
			while (validation) {
				System.out.print("Enter Train Name : ");
				trainType = SC.next().toUpperCase();
				validation = (validatingString(trainType)) ? false : true;
			}
			validation = true;
			return trainType;
		}
	}

	private Boolean validatingString(String train) {

		return train.matches("^[A-Z]{2,18}$");
	}

	public Train getTrainDetail() {

		Train t = new Train();

		t.setTrainNumber(getTrainNumber());
		t.setTrainName(getTrain(0));
		t.setTrainType(getTrain(1));

		return t;
	}
}