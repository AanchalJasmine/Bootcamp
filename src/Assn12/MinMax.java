package Assn12;

import java.util.Scanner;

public class MinMax {
	public static void main(String args[]) {
		int max=0;
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter the size of the array :");
	        int size= sc.nextInt();
	        System.out.println("Enter the elements of the array :");
	        int myArray[]=new int[size];
	        for(int i=0; i<size; i++){
	             myArray[i]= sc.nextInt();
	}
	        for(int i=0; i<size; i++) {
	        	if(myArray[i]>max) {
	        		max=myArray[i];}}
	     int min= myArray[0];
	     	for(int i=0; i<size; i++) {
	     		if(myArray[i]<min) {
	     			min=myArray[i];
	     		}
	     	
	     	}System.out.println("The maximum value in array = "+max+" and the minimum value in array = "+min);}}

