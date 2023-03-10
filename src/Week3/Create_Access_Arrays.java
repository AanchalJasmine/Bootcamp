package Week3;

public class Create_Access_Arrays {
	public static void main(String args[]) {
		int A[]= {1,2,3,4,5};
		int B[]=new int[5]; 
		int C[];
		C = new int[7];
		int[] D=new int[9];
		System.out.println(A.length);
		for(int i=0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
		System.out.println(B.length);
		for(int i=0; i<B.length; i++)
		{
			System.out.println(B[i]);
		}
		System.out.println(C.length);
		for(int i=0; i<C.length; i++)
		{
			System.out.println(C[i]);
		}
		System.out.println(D.length);
		for(int i=0; i<D.length; i++)
		{
			System.out.println(D[i]);
		}
	}

}
