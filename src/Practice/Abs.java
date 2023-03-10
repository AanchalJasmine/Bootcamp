package Practice;
abstract class A{
abstract void display();
}
abstract class B extends A{
	abstract void show();
}
class C extends B{
	void display() {
		System.out.println("Hey! How are you doing?");
	}
	void show() {
		System.out.println("Hello World!");
	}
}

public class Abs {
	public static void main(String args[]) {
	C ac= new C();
	ac.display();
	ac.show();
	

}}
