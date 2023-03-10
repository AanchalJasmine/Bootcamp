package Feb_16_2023;

import java.util.Scanner;
class Exe extends Exception{
	public String toString() {
		return "Dimensions of the area cannot be negative";
	}
	
}

public class NegDim {
	public static void main(String args[]) throws Exe{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int l= sc.nextInt();
		int b= sc.nextInt();
		try {
			if(l<0||b<0) {
				throw new Exe();
			}
			System.out.println(l*b);
			}
		catch(Exe e){
			System.out.println(e);
		}
		
	}
}


