package Assn12;
import java.util.Scanner;
public class FindArrIndexValue {
			public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size of the array :");
	        int size= sc.nextInt();
	        System.out.println("Enter the elements of the array :");
	        int myArray[]=new int[size];
	        for(int i=0; i<size; i++){
	             myArray[i]= sc.nextInt();
	        }
	        System.out.println("Enter the value to be searched");
	        int search= sc.nextInt();
	        for(int i=0; i<size; i++){
	            if(search==myArray[i]){
	                System.out.println("The index of the element searched = "+i);
	            }
	        }
	    }
	}

