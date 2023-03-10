package Feb_17_2023;

import java.util.Scanner;

class ArrOfObj{
String name;
int salary;
int doj;
void ArrOfObj(String n, int s, int d) {
	name=n;
	salary=s;
	doj=d;
}

}
public class Practice8 {
	void display(String n, int s, int d) {
		System.out.println(n+" "+s+" "+" "+d);
		
		
	}
	public static void main(String args[]) {
		int size=10;
		ArrOfObj obj[]= new ArrOfObj[size];
		
		
		for(int i=0; i<size;i++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the name: ");
			String n= sc.nextLine();
			System.out.println("Enter the salary: ");
			int s= sc.nextInt();
			System.out.println("Enter the salary: ");
			int d= sc.nextInt();
			
		}
		for(int i=0; i<size; i++) {
			 
		}
		
	}

	

}

