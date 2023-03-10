package Practical;
abstract class bike{
	abstract void run();
}
class Honda extends bike{
	void run() {
		System.out.println("Runs faster");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Honda obj= new Honda();
		obj.run();
	}

}
