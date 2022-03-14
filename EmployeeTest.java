package cap;

class Employee{
	private String firstName;
	private String lastName;
	private double Salary;
	
	public Employee(String firstName,String lastName,double Salary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getlasttName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double Salary) {
		if(Salary>0) {
		this.Salary=Salary;
		}
		else {
			this.Salary=0.0;
		}
	}
	public void display() {
		System.out.println(this.firstName+" "+this.lastName+" earns Rs."+Salary*12+" yearly");
	}
	public void  afterhike() {
		double yearlySalary=Salary*12;
		double withhike=yearlySalary+yearlySalary*10/100;
		System.out.println(this.firstName+" "+this.lastName+" earns Rs."+withhike+" yearly");
	}
}


public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1=new Employee("Harsha","vardhan",10000);
		Employee employee2=new Employee("Lokesh","vardhan",20000);
		employee1.display();
		employee2.display();
		System.out.println("After hike");
		employee1.afterhike();
		employee2.afterhike();
	}

}
