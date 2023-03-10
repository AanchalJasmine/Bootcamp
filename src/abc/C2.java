package abc;

public class C2 {
	public static void main(String args[])   
	{    
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	       
	//Outer loop work for rows  
	for (int i=0; i<5; i++)   
	{  
	//inner loop work for space      
	for (int j=2*(5-i); j>=0; j--)         
	{  
	//prints space between two stars      
	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (int j=0; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   
	}  

