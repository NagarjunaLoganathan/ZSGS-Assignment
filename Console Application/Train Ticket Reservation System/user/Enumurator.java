package railway.user;

public class Enumurator {

	enum Gender{
		
		F, M, O
		
		/*	F - Female
			M - Male
			O - Others (Transgender) */
	}
	
	public enum Berths {
		
		U, M, L, SU, SL

		/*	U - Upper Berth
			M - Middle Berth
			L - Lower Berth
			SU - Side Upper Berth
			SL - Side Lower Berth */
	}
	
	public enum AvailableBerths{
		
		U, M, L, SU, SL, RAC, WL

		/*	U - Upper Berth
			M - Middle Berth
			L - Lower Berth
			SU - Side Upper Berth
			SL - Side Lower Berth
			RAC - Reservation Against Cancellation
			WL - Waiting List */
	}
}