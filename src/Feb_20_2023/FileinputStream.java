package Feb_20_2023;
import java.io.FileInputStream;  
public class FileinputStream {
	
	public class DataStreamExample {  
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }  
}
