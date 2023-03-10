package Assn13;

public class Q3 {
	int sum=0;
	int arr[];
	int n;
	void read(int ar[],int len) {
		arr=ar;
		n=len;
		}
	void display() {
		System.out.println("Element of the array: ");
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void find_largest() {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest: "+max);
	}
	void find_smallest() {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
		
	}
}
		System.out.println("Smallest: "+min);
		}
	void sum() {
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum : "+sum);
		}
	
	void find_mean() {
		int mean=sum/n;
		System.out.println("Mean: "+mean);
	}
	public static void main(String args[]) {
		Q3 obj = new Q3();
		int ar[]= {17,28,37,49,52};
		int len = ar.length;
		obj.read(ar, len);
		obj.display();
		obj.find_largest();
		obj.find_smallest();
		obj.sum();
		obj.find_mean();
	}}
