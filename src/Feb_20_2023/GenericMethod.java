package Feb_20_2023;
class Demo{
	static <T> void genericMethod(T data) {
		System.out.println("Generic Method");
		System.out.println("Data passed "+data);
	}
}
public class GenericMethod {
	public static void main(String args[]) {
		Demo d= new Demo();
		d.<String>genericMethod("Java Programming");
		d.<Integer>genericMethod(25);
	}
}

