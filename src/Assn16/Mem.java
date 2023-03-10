package Assn16;

class Member{
	
		String name="Aanchal";
		int age=22;
		int p_no=781;
		String add="sector 6 mdc";
		int salary=15000;
		void prt() {
			System.out.println("The Name is : "+name);
			System.out.println("The Age is : "+age);
			System.out.println("The Phone Number is : "+p_no);
			System.out.println("The Address is : "+add);
			System.out.println("The  is Salary : "+salary);
}
}
class Emp extends Member {
	String Specialization;
}
class Man extends Member {
	String department;
}

public class Mem {
	public static void main(String args[]) {
		Emp obj= new Emp();
		obj.prt();
		Man obj1= new Man();
		obj1.prt();
		
	}}


