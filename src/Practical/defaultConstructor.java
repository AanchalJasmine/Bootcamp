package Practical;

public class defaultConstructor {
	int modelNo;
	String modelName;
	public defaultConstructor() {
		modelNo=6752;
		modelName="Mustang";
	}
	public static void main(String args[]) {
		defaultConstructor a= new defaultConstructor();
		System.out.println(a.modelName);
		System.out.println(a.modelNo);
		
	}
	

}
