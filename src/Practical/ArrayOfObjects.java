package Practical;


public class ArrayOfObjects {
	int pid;
	String Pname;
	ArrayOfObjects(int proId, String proName) {
		this.pid=proId;
		this.Pname=proName;}
	void display() {
		System.out.println(pid+Pname);
	}
		
	
		public static void main(String args[]) {
	ArrayOfObjects[] obj= new ArrayOfObjects[2];
	
	obj[0]=new ArrayOfObjects(23,"dbhw");
	obj[1]=new ArrayOfObjects(67,"vwgvx");
	
	for(int i=0;i<obj.length;i++) {
		obj[i].display();
	}
	
	

		}}
