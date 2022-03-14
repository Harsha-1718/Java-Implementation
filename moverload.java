package oopss;

class operations{
	public int op(int a,int b) {
		return a+b;
	}
	public int op(int a,int b,int c) {
		return a*b*c;
	}

}

public class moverload {
	public static void main(String[] args) {
	operations chk=new operations();
	int add=chk.op(44,33);
	int mul=chk.op(2,3,4);
	System.out.println(add);
	System.out.println(mul);
}
}