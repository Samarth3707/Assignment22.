package middleelements;
import java.util.Scanner;

public class middleelements {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of arry");
		n=sc.nextInt();
		System.out.print("Element of arrys");
		int A[]=new int[n];
		int S=A.length/2;
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		if(A.length%2!=0)
		{
			System.out.print("middle element in arry"+A[S]);
		}
		else
		{
			System.out.print("middle element :"+A[S-1]+"&"+A[S]);
		}
		
	}

}
