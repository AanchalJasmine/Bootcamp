package Feb_20_2023;

public class Feb_21_2023 {
	public static void main(String args[]) {
		Object obj[]=new Object[3];
		obj[0]="Hello!";
		obj[1]="Bye";
		obj[2]=new Integer[10];
		String str;
		for(int i=0;i<=3;i++) {
			str=(String) obj[i];
			System.out.println(str);
		}
	}

}// No compile time error is generated but only run time error is generated.
