package Feb_20_2023;
//class<T>{
	
//} 
public class Generics_Arrays <T>{
	T data[]= (T[]) new Object[3];
	public static void main(String args[]) {
		Generics_Arrays<String> gd= new Generics_Arrays();
		gd.data[0]="Hi!";
		gd.data[1]="Bye!";
		//gd.data[3]=new Integer[10];
		
		
	}
}
