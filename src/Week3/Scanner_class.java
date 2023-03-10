package Week3;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String args[]) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements you wish to enter");
		n=sc.nextInt(); 
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		 
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		}  
		
		
		
	}

