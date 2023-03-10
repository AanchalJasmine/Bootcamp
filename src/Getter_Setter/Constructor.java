package Getter_Setter;

public class Constructor {
	int rno;
	String name;
	Constructor(){
		name="Aanchal";
		rno=11;
	}
	Constructor(String str, int n){
		name=str;
		rno=n;
	}
	
	public static void main(String args[]) {
		Constructor a= new Constructor();
		Constructor b= new Constructor("Diksha",21);
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(a.rno);
		System.out.println(b.rno);
		
		
	}

}
