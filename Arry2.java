package Arry2;
import java.util.*;

public class Arry2 {
	public static void main(String[] args)
	{
		int n,sum=0;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of element u wants in aary");
		n=sc.nextInt();
		System.out.print("Enter all the elements");
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
			sum=sum+A[i];
		}
		System.out.print("sum of all Elements :"+sum);
		
	}
	
	

}
