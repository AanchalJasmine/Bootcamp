package Assn14;
import java.io.*;
class GetSet {
	private String name;
    public String getName() { return name; }
    public void setName(String N)
    {
        this.name = N;
    }
}
public class GetterAndSetter {
	    public static void main(String[] args) {
	        GetSet obj = new GetSet();
	        obj.setName("Hello World");
	        System.out.println(obj.getName());
	    }
}
