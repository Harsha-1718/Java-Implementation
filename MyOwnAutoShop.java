package cap;

class Car{
	public int speed;
	public double regularPrice;
	public String color;
	
	public Car(int speed,double regularPrice,String color) {
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	public double getSalePrice() {
		return regularPrice;
	}
}
class Truck extends Car{
	public int weight;
	
		public Truck(int speed,double regularprice,String color,int weight) {
			super(speed,regularprice,color);
			this.weight=weight;
		}
		public double getSalePrice()
		{
			if(weight>2000) {
				return super.getSalePrice()-(0.10*super.getSalePrice());
			}
			else {
				return super.getSalePrice()-(0.20*super.getSalePrice());
			}
		}
}

class Ford extends Car{
	public int year; 
	public int manufacturerDiscount;
	
	public Ford(int speed,double regularprice,String color,int year,int manufacturerDiscount) {
		super(speed,regularprice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public double getSalePrice() {
		return super.getSalePrice()-manufacturerDiscount;
	}
}
class Sedan extends Car{
	public int length;
	
	public Sedan(int speed,double regularprice,String color,int length) {
		super(speed,regularprice,color);
		this.length=length;
	}
	public double getSalePrice() {
		if(length>20) {
			return super.getSalePrice()-(0.05*super.getSalePrice());
		}
		else {
			return super.getSalePrice()-(0.10*super.getSalePrice());
		}
	}
}
public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Sedan se=new Sedan(100,100000,"Pink",20);
		Ford fe=new Ford(200,200000,"green",1999,10);
		Truck tk=new Truck(150,250000,"orange",200);
		Car cc=new Car(120,100000,"Blue");
		System.out.println(se.getSalePrice());
		System.out.println(fe.getSalePrice());
		System.out.println(tk.getSalePrice());
		System.out.println(cc.getSalePrice());
	}

}
