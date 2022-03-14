package cap;
class Book{
	private String BookName;
	private String IsbnNumber;
	private String authorName;
	private String publisher;
	public Book(String BookName,String IsbnNumber,String authorName,String publisher){
		this.authorName=authorName;
		this.IsbnNumber=IsbnNumber;
		this.BookName=BookName;
		this.publisher=publisher;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String BookName) {
		this.BookName=BookName;
	}
	public String getIsbnNumber() {
		return IsbnNumber;
	}
	public void setIsbnNumber(String IsbnNumber) {
		this.IsbnNumber=IsbnNumber;
	}
	public String getauthorName() {
		return BookName;
	}
	public void setauthorName(String authorName) {
		this.authorName=authorName;
	}
	public String getpublisher() {
		return BookName;
	}
	public void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	public void getBookInfo() {
		System.out.println(authorName+" is the author for "+BookName+"and it is published by "+publisher);
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book kk=new Book("You can win","D00","Shiv Khera","Blooms bury.");
		kk.getBookInfo();
	}
}
