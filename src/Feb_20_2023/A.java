package Feb_20_2023;
import java.io.File;
public class A {
	

	
	   public static long getFileSize(String filename) {
	      File file = new File(filename);
	      if (!file.exists() || !file.isFile()) {
	         System.out.println("File doesn\'t exist");
	         return -1;
	      }
	      return file.length();
	   }
	   public static void main(String[] args) {
	      long size = getFileSize("c:/java.txt");
	      System.out.println("Filesize in bytes: " + size);
	   
	}

}
