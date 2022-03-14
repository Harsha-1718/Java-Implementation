
public class generalOperations {

	public static void main(String[] args) {
		String s1="Harsha";
		String s4="Harsha";
		String s5=new String("Harsha");
		String s6=new String("Harsha");
		String s2=new String("Vardhan");
		char ch[]= {'r','e','d','d','y'};
		String s3=new String(ch);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		System.out.println(s6==s5);
		System.out.println(s1.equals(s5));
		System.out.println(s1==s5);
		System.out.println(s3.compareTo(s1));
		String s7=s1.concat(s2);
		System.out.println(s7);
	}

}
