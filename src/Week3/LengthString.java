package Week3;

public class LengthString {
	public static void main(String args[])
	{
		String str = "Welcome";
		String str1 = "WELCOME";
		System.out.println(str.replace("e","k"));
		System.out.println(str.charAt(4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("W"));
		System.out.println(str.equals(str1));
		System.out.println(str.length());
		String stg1="java";
		String stg2="python";
		String stg3="java";
		String stg4="    JAushdjV";
		int s = stg2.compareTo(stg4) ;
		System.out.println(s);
		int s1 = stg1.compareTo(stg3) ;
		System.out.println(s);
		System.out.println(stg4.trim());

		
		System.out.println(str.substring(3,6));
	}
}
