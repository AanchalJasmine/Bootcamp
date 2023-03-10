package Practise_21_2023;

import java.io.File;
public class FileSizeNPath {
		public static void main(String args[]) throws Exception {
			File f= new File("C:\\Users\\aanchal\\Desktop\\Test\\AA.txt");
			System.out.println(f.length());
			System.out.println(f.getAbsolutePath());
			
		}
	
}

