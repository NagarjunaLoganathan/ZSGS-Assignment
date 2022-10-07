package railway.user;

public class Passenger extends Enumurator {

	private String name;
	private byte age;
	private Gender gender;
	private Berths preferedBerth;
	private String childName;
	private byte childAge;
	private Gender childGender;
	private AvailableBerths allotedBerth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Berths getPreferedBerth() {
		return preferedBerth;
	}

	public void setPreferedBerth(Berths preferedBerth) {
		this.preferedBerth = preferedBerth;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public byte getChildAge() {
		return childAge;
	}

	public void setChildAge(byte childAge) {
		this.childAge = childAge;
	}

	public Gender getChildGender() {
		return childGender;
	}

	public void setChildGender(Gender childGender) {
		this.childGender = childGender;
	}

	public AvailableBerths getAllotedBerth() {
		return allotedBerth;
	}

	public void setAllotedBerth(AvailableBerths allotedBerth) {
		this.allotedBerth = allotedBerth;
	}

}