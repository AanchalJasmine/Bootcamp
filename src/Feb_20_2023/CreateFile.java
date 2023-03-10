package Feb_20_2023;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String args[]) {
		
			File myobj= new File("C:\\Jasmine.txt");
			try {
				if(myobj.createNewFile()) {
					System.out.println("File Created : "+myobj.getName());
				}
				else
				{
					System.out.println("File already exist");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
