package Practise_21_2023;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;



public class Copy {
	public static void main(String args[]) throws Exception {
		FileInputStream f= new FileInputStream("C:\\Users\\aanchal\\Desktop\\Test");
		FileWriter f1= new FileWriter("C://Users//aanchal//Desktop//Test2");
		BufferedWriter wrt= new BufferedWriter(f1);
		
		int b;
		while((b=f.read())!=-1) {
			wrt.write(b);
		}
		f1.close();
		wrt.close();
		System.out.println("Copied");
	}
}
