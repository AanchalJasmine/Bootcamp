package Feb_20_2023;
import java.io.*;

	
	
public class WriteFile {
	public static void main(String args[]) throws Exception {
		{try {
			FileWriter wrt= new FileWriter("file.txt");
			BufferedWriter BWrt = new BufferedWriter(wrt);
			BWrt.write("Learning file handling in java!");
			BWrt.close();
			System.out.println("Successfull!");
			}
			catch(Exception e) {
				System.out.println("An error Occured!");
			}
}}}
