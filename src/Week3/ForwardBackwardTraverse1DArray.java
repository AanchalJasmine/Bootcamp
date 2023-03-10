package Week3;

public class ForwardBackwardTraverse1DArray {
	public static void main(String args[]) {
		int A[]= {1,2,3,4,5};
		for(int i=0; i < A.length; i++)
		{
			System.out.println(A[i]);
		}
		for(int i=A.length-1; i >=0; i--)
		{
			System.out.println(A[i]);
		}
	}

}
