package Assn16;
class Parent{
	void Prt(){
		System.out.println("This is parent class!");
	}}
class Child extends Parent{
	void prt1() {
		System.out.println("This is child class!");
	}
}

public class par {
	public static void main(String args[]) {
		Parent p= new Parent();
		Child c= new Child();
		p.Prt();
		c.prt1();
		c.Prt();
	}

}
