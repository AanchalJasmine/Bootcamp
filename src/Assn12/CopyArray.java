package Assn12;

import java.util.Scanner;

public class CopyArray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array :  ");
		int size= sc.nextInt();
		System.out.println("Enter the elements of the array :  ");
		int array[]= new int[size];
		for(int i=0; i<size; i++) {
			array[i]= sc.nextInt();
		}
		int array2[]= new int[size];
		for(int i=0; i<size; i++) {
			array2[i]= array[i];
		}
		System.out.println("The elements of original array are:");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
			
		}
		System.out.println("The elements of copied array are:");
		for(int i=0; i<size; i++) {
			System.out.print(array2[i]+" ");
		}
		
	    
		
		
	}

}
