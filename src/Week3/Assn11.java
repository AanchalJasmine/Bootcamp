package Week3;

import java.util.Scanner;

public class Assn11 {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num = n.nextInt();
		int sum = 0 , digit ;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of digits of the number entered is "+sum);
		}
	}



