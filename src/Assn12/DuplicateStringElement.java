package Assn12;

public class DuplicateStringElement {
	public static void main(String[] args) {      
        
          
       String [] arr = new String [] {"abc","abc","jasmine","aanchal","jasmine"};   
          
        System.out.println("Duplicate elements in given array: "); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  


