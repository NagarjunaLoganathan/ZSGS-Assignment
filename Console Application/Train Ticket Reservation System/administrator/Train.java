package railway.administrator;

public class Train {

	private int trainNumber;
	private String trainName;
	private String trainType;
	private int berths;
	private int rac;
	private int waitingTickets;

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public int getBerths() {
		return berths;
	}

	public void setBerths(int berths) {
		this.berths = berths;
	}

	public int getRac() {
		return rac;
	}

	public void setRac(int rac) {
		this.rac = rac;
	}

	public int getWaitingTickets() {
		return waitingTickets;
	}

	public void setWaitingTickets(int waitingTickets) {
		this.waitingTickets = waitingTickets;
	}
}