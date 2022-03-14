package exceptions;

public class example {

	public static void main(String[] args) {
		
		try {
			int a=100;
			a=a/0;
			int b[]=new int[5];
			b[6]=20;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}

}
