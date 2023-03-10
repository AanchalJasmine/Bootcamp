package Week3;

import java.util.Scanner;

public class SecondLargestNo {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no. of elements in array :");
	int n = sc.nextInt();
	
	System.out.println("Enter the elements:");
	int arr[]= new int[n];
	for(int i=0; i<=n;i++) {
		arr[i]=sc.nextInt();
	}
	int max1=0, max2=0;
	for(int i=0;i<n;i++) {
		if(max1<arr[i]) {
			max1=arr[i];
		
		
	}
		
	}
	}
	}
	


