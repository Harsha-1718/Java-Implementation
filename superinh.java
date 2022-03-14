package oopss;

class parent{
	private String Name;
	private String Id;
	private Long Mobno;
	
	public parent(String Name,String Id,Long Mobno) {
		this.Name=Name;
		this.Id=Id;
		this.Mobno=Mobno;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id=Id;
	}
	public Long getMobno() {
		return Mobno;
	}
	public void setMobno() {
		this.Mobno=Mobno;
	}
	public void display() {
		System.out.println(Name);
		System.out.println(Id);
		System.out.println(Mobno);
	}
}

class child extends parent{
	private String address;
	child(String Name,String Id,Long Mobno,String address){
		super(Name,Id,Mobno);
		this.address=address;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
}

public class superinh {
	public static void main(String[] args) {
		child ch=new child("Harsha","D00002",9890L,"some street");
		ch.display();
		System.out.println(ch.getaddress());
		
	}
}
