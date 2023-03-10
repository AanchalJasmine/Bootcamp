package Feb_20_2023;
import java.io.File; 
public class B {
	 
	
	public static void main(String[] args)  
	{     
	try  
	{         
	File f= new File("E:\\demo.txt");           //file to be delete  
	if(f.delete())                      //returns Boolean value  
	{  
	System.out.println(f.getName() + " deleted");   //getting and printing the file name  
	}  
	else  
	{  
	System.out.println("failed");  
	}  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}  

