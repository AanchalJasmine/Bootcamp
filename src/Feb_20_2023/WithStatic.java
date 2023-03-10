package Feb_20_2023;

public class WithStatic {
	static <T> void show(T[] list) {
		for (T x : list) {
			System.out.println(x);
		}
	}
	public static void main(String args9[]) {
		{
			show(new String[] {"Hi","Hello","Bye"});
			show(new Integer[] {10,20,30});
		}
	}
}
