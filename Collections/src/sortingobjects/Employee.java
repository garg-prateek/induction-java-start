package sortingobjects;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	Employee(int id1, String name1) {
		this.id = id1;
		this.name = name1;
	}

	@Override
	public int compareTo(Employee o) {
		int id2 = this.id;
		int id3 = o.id;

		if (id2 < id3) {
			return -1;
		} else if (id2 > id3) {
			return 1;
		} else {
			return 0;
		}
	}
}
