package railway.tickets;

import java.util.ArrayList;

import railway.user.Enumurator.AvailableBerths;
import railway.user.Enumurator.Berths;
import railway.user.Passenger;

public class TicketBooking {

	private void searchingBerth(Passenger p) {

		if (p.getAge() > 60 && availableLowerBerth > 0) {
			p.setAllotedBerth(AvailableBerths.L);
			berthAllocation(p);
		} else if (p.getChildAge() != 0 && availableLowerBerth > 0) {
			p.setAllotedBerth(AvailableBerths.L);
			berthAllocation(p);
		} else if ((p.getPreferedBerth().equals(Berths.L) && availableLowerBerth > 0)
				|| (p.getPreferedBerth().equals(Berths.M) && availableMiddleBerth > 0)
				|| (p.getPreferedBerth().equals(Berths.U) && availableUpperBerth > 0)
				|| (p.getPreferedBerth().equals(Berths.SU) && availableSideUpperBerth > 0)
				|| (p.getPreferedBerth().equals(Berths.SL) && availableSideLowerBerth > 0)) {
			if (p.getPreferedBerth().equals(Berths.L)) {
				p.setAllotedBerth(AvailableBerths.L);
				berthAllocation(p);
			} else if (p.getPreferedBerth().equals(Berths.M)) {
				p.setAllotedBerth(AvailableBerths.M);
				berthAllocation(p);
			} else if (p.getPreferedBerth().equals(Berths.U)) {
				p.setAllotedBerth(AvailableBerths.U);
				berthAllocation(p);
			} else if (p.getPreferedBerth().equals(Berths.SL)) {
				p.setAllotedBerth(AvailableBerths.SL);
				berthAllocation(p);
			} else if (p.getPrefferedBerth().equals(Berths.SU)) {
				p.serAllotedBerth(AvailableBerths.SU);
				berthAllocation(p);
			}
		} else if (availableLowerBerth > 0) {
			p.setAllotedBerth(AvailableBerths.L);
			berthAllocation(p);
		} else if (availableMiddleBerth > 0) {
			p.setAllotedBerth(AvailableBerths.M);
			berthAllocation(p);
		} else if (availableUpperBerth > 0) {
			p.setAllotedBerth(AvailableBerths.U);
			berthAllocation(p);
		} else if (availableSideLowerBerth > 0) {
			p.setAllotedBerth(AvailableBerths.SL);
			berthAllocation(p);
		} else if (availableSideUppererBerth > 0) {
			p.setAllotedBerth(AvailableBerths.SU);
			berthAllocation(p);
		} else if (availableRACTicket > 0) {
			p.serAllotedBerth(AvailableBerths.RAC);
			berthAllocation(p);
		} else if (availableWaitingTicket > 0) {
			p.setAllotedBerth(AvailableBerths.WL);
			allocatingBerth(p);
		}
	}

	private void allocatingBerth(Passenger p) {

	}

	public void bookTicket(ArrayList<Passenger> passengerList) {

		for (Passenger p : passengerList) {

			searchingBerth(p);
		}
	}
}