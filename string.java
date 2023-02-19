package examples;

public class string {         //Duplicate elements in array

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,1,3,4};
//		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					System.out.println(arr[j]);
			}
		}
	}

}
