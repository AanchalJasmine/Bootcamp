package Feb_20_2023;
class MyArray<T>{
	T A[]= (T[]) new Object[10];
	int length=0;
	public void append(T v) {
		A[length++]=v;
	}
	public void display() {
		for(int i=0; i<length; i++) {
			System.out.println(A[i]);
		}
	}
}
public class GenricArray {
	public static void main(String args[]) {
		MyArray<Integer> gd= new MyArray<>();
		gd.append(10);
		gd.append(20);
		gd.display();
		
	}
}
