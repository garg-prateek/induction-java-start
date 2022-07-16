
public class Test {

	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setFirstName("Prateek");
		passenger.setLastName("Garg");
		
		Passenger passenger1 = new Passenger();
		passenger1.setId(123);
		passenger1.setFirstName("Prateek");
		passenger1.setLastName("Garg");
		
		System.out.println(passenger.equals(passenger1));
		System.out.println(passenger);
	}

}
