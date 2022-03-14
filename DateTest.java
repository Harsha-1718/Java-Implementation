package cap;
class Date{
	private int month;
	private int day;
	private int year;
	
	public Date(int month,int day,int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getmonth() {
		return month;
	}
	public void setmonth(int month) {
		this.month=month;
	}
	public int getday() {
		return day;
	}
	public void setday(int day) {
		this.day=day;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public void displayDate(){
		System.out.println(month+"/"+day+"/"+year);
		}
}

public class DateTest {
	public static void main(String[] args) {
		Date dt=new Date(03,04,2022);
		dt.displayDate();
	}
}
