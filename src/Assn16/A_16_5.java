package Assn16;

import java.util.Scanner;

class prt{
	void prt1(int n,char c){
		int n1=n;
		char c1=c;
		System.out.println(n1);
		System.out.println(c1);
	}
	void prt1(char c,int n) {
		char c1=c;
		int n1=n;
		System.out.println(c1); 
		System.out.println(n1);
	}
}
public class A_16_5 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer and a character :");
		int a= sc.nextInt();
		char b= sc.next().charAt(0);
		prt obj = new prt();
		obj.prt1(a, b);
		obj.prt1(b, a);
	}

}
