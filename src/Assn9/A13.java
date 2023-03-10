package Assn9;

public class A13 {
	public static void main(String args[]) {
	int year = 2024;
	int cen;
	if(year!=0) {
		int result=(year%4==0)?(cen=1):((year%100==0)?(cen=0):(year%4==0?(cen=1):(cen=0)));
	if (result==1) {
		System.out.println("Year is leap year");}
	else {
		System.out.println("Year is not a leap year");
	}
	}
	else{
		System.out.println("You enetered zearo year");
	}
	}
	}


