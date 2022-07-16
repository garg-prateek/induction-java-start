
public class Passenger {
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return ("Passenger first name: " + this.firstName + " and last name: " + this.lastName);
	}

	@Override
	public boolean equals(Object obj) { // here instead of object Passenger and at last no need to typecast it.
		Passenger passenger = (Passenger) obj;
		if (passenger.getId() == this.getId() && passenger.getFirstName().equals(this.firstName) 
				&& passenger.getLastName().equals(this.lastName)) {
			return true;
		}
		return false;
	}
}
