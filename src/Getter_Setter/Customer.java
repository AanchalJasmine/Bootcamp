package Getter_Setter;

public class Customer {
	public int id;
	public String name;
	Customer(int i, String n){
		 id=i;
		 name=n;
		}
	void display() {
		System.out.println("Name is "+name);
		System.out.println("ID is "+id);
	}
	public static void main(String args[]) {
		Customer obj[]= new Customer[3];
		obj[0]= new Customer(1,"abc");
		obj[1]= new Customer(2,"avc");
		obj[2]= new Customer(3,"ajbc");
		obj[0].display();
		obj[1].display();
		obj[2].display();
	}
	

}
