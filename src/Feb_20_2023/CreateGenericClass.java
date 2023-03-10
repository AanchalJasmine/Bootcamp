package Feb_20_2023;
class data<T>{
	
	private T obj;
	public void setData(T v)
	{
		obj=v;
	}
	public T getData() {
		return obj;
	}
}
public class CreateGenericClass {
	public static void main(String args[]) {
		data<Integer> d=new data<>();
		d.setData(10);
		System.out.println(d.getData());
		data<String> d1= new data<>();
		d1.setData("Hello");
		System.out.println(d1.getData());
	}
}
