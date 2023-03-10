package Feb_16_2023;

import java.util.Scanner;

class LowBalExp extends Exception{
	public String toString() {
		return "Please enter the amount more than 5000";
	}
}





public class UserDefinedExp {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the amount you wish to withdrow");
int amt= sc.nextInt();
try {
	if(amt<5000) {
		throw new LowBalExp();
		}
	}
catch(LowBalExp e) {
	System.out.println(e);
}
}

}
