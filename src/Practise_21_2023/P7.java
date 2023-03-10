package Practise_21_2023;
class demo{
	static <T> void display(T v) {
	System.out.println("Data : "+v);}
}
public class P7 {
	public static void main(String args[]) {
	demo.display("abc");
	demo.display(7);
	demo.display("hello");
	}
}
