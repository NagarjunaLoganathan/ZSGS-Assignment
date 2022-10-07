package railway.user;

public class InputValidation {

	public static Boolean validatingName(String name) {

		return name.matches("(^[A-Z])\\w[A-Za-z\\s]{2,18}$");
	}

	public static Boolean validatingAge(Byte age, int check) {

		boolean status = false;
		if (check == 0) {
			status = (age > 5) ? true : false;
			System.out.println("Passenger should not under age 5.");
		} else {
			status = (age <= 5) ? true : false;
			System.out.println("Your child has exceeded 5 age. So, please book separate berth.");
		}
		return status;
	}

	public static Boolean validatingGender(char gender) {

		return (gender == 'F' || gender == 'M' || gender == 'O') ? true : false;
	}

	public static Boolean validatingBerth(String berth) {

		return (berth.equals("U") || berth.equals("M") || berth.equals("L") || berth.equals("SU") || berth.equals("SL"))
				? true
				: false;
	}

}