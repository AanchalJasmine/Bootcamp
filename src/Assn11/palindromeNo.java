package Assn11;
import java.util.Scanner;
public class palindromeNo {
	
	
	    public static void main(String args[]){
	        int n, r, sum=0,temp;
	        Scanner num = new Scanner(System.in);
	        System.out.println("Enter a number :");
	        n = num.nextInt();
	        temp=n;
	        while(n>0){
	            r=n%10;
	            sum=(sum*10)+r;
	            n=n/10;
	            }
	        if(temp==sum){
	                System.out.println("palindrome number");
	            }
	        else{
	                System.out.println("not a palindrome number");
	            }
	            
	    }
	}

