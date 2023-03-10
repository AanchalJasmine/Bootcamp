package Practical;
interface I1{
	final int a=10;
	void display();
}
interface I3{
	void show();}

class I2 implements I1,I3{
	public void display() {
		System.out.println("Hello World!");}
	public void show() {
	System.out.println("Hello Jasmine!");}
	
public class IInterffaces {
		public static void main(String args[]) {
		I2 obj = new I2();
		obj.display();
		obj.show();
		
	}
	}
}
