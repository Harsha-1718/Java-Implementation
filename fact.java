public class fact {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	static int factorial(int n) {
		int facto=1;
		for(int i=n;i>0;i--) {
			facto=facto*i;
		}
		return facto;
	}

}
