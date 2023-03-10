package Practice;
/*class Animal{
	void eat() {
		
	}
}
class Herbivores extends Animal{
	void eat() {
		System.out.println("Eat plants");
	}
}
class Carnivores extends Animal{
	void eat() {
		System.out.println("Eat flesh");
	}
}
class Omnivores extends Animal{
	void eat() {
		System.out.println("Eat plants and flesh");
	}
}
public class P1 {
	public static void main(String args[]) {
		Animal a= new Omnivores();
		a.eat();
		Carnivores c=new Carnivores();
		c.eat();
	}

}*/
class P1{
	interface Ab{
		public int add(int a, int b);
	}
	interface Ba{
		public int mul(int x,int y);
	}
	class cal implements Ab,Ba{
		public int add(int a, int b) {
			return a+b;
		}
		public int mul(int a, int b) {
			return a*b;
		}

	public class InterfaceImplementation {
	public static void main(String args[]) {
	//cal c= new cal();

	//System.out.println(c.add(1,4));
	}}}
}
