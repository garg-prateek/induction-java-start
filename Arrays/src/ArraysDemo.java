
public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[5];

		// int arr[]= {10,20,30,40,50};

		int arr[] = new int[5];
		arr[0]=10;
		arr[1]=new Integer (20);
		//arr[2]=(int) 12.5;
		arr[2]=30;
		
		//arr[7]=70;
		System.out.println("elements are as: ");
		for(int element:arr) {
			System.out.println(element);
		}
		
		long[]arr1=new long[4];
		for(long element:arr1) {
			System.out.println(element);
		
	}

}
}
