package Assn11;
import java.util.Scanner;

public class EnterNoPrintWords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		String ar[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		int v=0;
		String word="";
		while(n>0) {
			v=n%10;
			for(int i = 0; i<=ar.length;i++) {
				if(v==i) {
					word=ar[i]+word;
				}
			}
			n=n/10;
		}
		System.out.println(word+" ");
	}
}
