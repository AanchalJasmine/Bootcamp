package Assn11;

import java.util.Scanner;

public class StrongNo {
	public static void main(String args[]) {
		Scanner n= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = n.nextInt();
		int fact=1, sum=0, temp;
		temp= num;
		while(num>0) {
			num=num%10;
			while(num>0) {
				fact=fact*num;
				sum=sum+fact;
				num--;
			}
		}
	}

}
