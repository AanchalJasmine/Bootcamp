package Assn12;
import java.util.Scanner;
public class Avg {
	        public static void main(String[] args) {
	        int sum=0, average;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size of the array you :");
	        int size= sc.nextInt();
	        System.out.println("Enter the elements of the array :");
	        int myArray[]=new int[size];
	        for(int i=0; i<size; i++){
	            myArray[i]= sc.nextInt();
	            }
	        for(int i=0; i<size; i++){
	            sum=sum+myArray[i];
	            }
	        average=sum/size;
	        System.out.println("The average of the elements of array is :"+average);
	    }
	}


