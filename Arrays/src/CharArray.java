
public class CharArray {

	public static void main(String[] args) {

		char c[] = { 'a', 'z', 'q', 'p', 'o','a' };
		if (c[0] == c[c.length-1]) {
			System.out.println("First and last elemets are same");
		} else {
			System.out.println("not same");
		}
	}

}
