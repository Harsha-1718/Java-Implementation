
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File(args[0]);
		try {
			BufferedReader in=new BufferedReader(new FileReader(file));
		String s;
		s=in.readLine();
		while(s!=null) {
			System.out.println("Read: "+s);
			s=in.readLine();
		}
		in.close();
		}
		catch(FileNotFoundException e2) {
			System.err.println("File not found: "+file);
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
	}

}
