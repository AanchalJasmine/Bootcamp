package Practise_21_2023;
class xyz<T extends Number>{
	T obj;
	public void  display(T v) {
	    obj=v;
		System.out.println("Data : "+obj);
	}
}
public class P5 {
	public static void main(String args[]) {
	xyz<Integer> a= new xyz();	
	a.display(327);
	}
}
