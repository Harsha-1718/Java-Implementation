public class maxelement {
	public static void main(String[] args) {
		
		int arr[]= {67,23,45,90,21,78};
		max(arr);
	}
	
	static void max(int arr[]) {
		int maximum=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maximum){
				maximum=arr[i];
			}
		}
		System.out.println(maximum);
	}
}
