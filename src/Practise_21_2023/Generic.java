package Practise_21_2023;

public class Generic {
	static <T> void genDisplay(T element) {
		System.out.println(element.getClass().getName()+"="+element);
	}
	public static void main(String args[]) {
		genDisplay("Hello");
		genDisplay(10);
		genDisplay(1.0);
		genDisplay('c');
	}
}
