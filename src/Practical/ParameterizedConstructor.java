package Practical;

public class ParameterizedConstructor {
	int modelNo;
	String modelName;
	public ParameterizedConstructor(int modelNo, String modelName) {
		this.modelNo=modelNo;
		this.modelName=modelName;
	}
	public static void main(String args[]) {
		ParameterizedConstructor a= new ParameterizedConstructor(5674,"volva");
		System.out.println(a.modelNo);
		System.out.println(a.modelName);
		
	}

}
