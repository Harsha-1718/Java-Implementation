
public class fibb {

	public static void main(String[] args) {
		fibonacci(5);

	}
	static void fibonacci(int k) {
		int i=0;
		int j=1;
		int l;
		System.out.print(i+" "+j);
		for(int n=2;n<k;n++) {
			l=i+j;
			System.out.print(" "+l);
			i=j;
			j=l;
		}
	}

}
