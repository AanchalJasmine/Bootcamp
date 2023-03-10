package Assn12;
import java.util.Scanner;
public class ArrContainsSpecificValue {
	
	
	        public static void main(String[] args) {
	        int array[]={1,2,3,4,5,6,7,8,9};
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the item value you wish to check in array :");
	        int item= sc.nextInt();
	        int index = -1;
	        for(int i=0; i<array.length; i++){
	            if(array[i]==item){
	                index=i;
	                break;}
	            }
	        if(index==-1){
	            System.out.println("The entered value is not present in the array");
	        }
	        else{
	            System.out.println("The entered value is present in the array");
	        }}}

