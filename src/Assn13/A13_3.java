package Assn13;

import java.util.Arrays;

class Array1{
	
	int[] a;
	int n;
	Array1(){
		int[] arr= {9,8,7,6,5,4};
		int len =arr.length;
		n=len;
		a=arr;
	}
	
	void show_data(){
		System.out.println("The elements of array: ");
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	void sort() {
		System.out.println("Elements of array after sorting: ");
		Arrays.sort(a);
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class A13_3 {

	public static void main(String[] args) {
		
		Array1 obj=new Array1();
		
		obj.show_data();
		obj.sort();

	}

}