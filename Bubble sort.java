/*
Problem Statement
Given an array A[], of size N containing positive integers. You need to print the elements of an array in increasing order.
Input
The first line of the input denotes the number of test cases 'T'. The first line of the test case is the size of the array and the second line consists of array elements.

For Python Users just complete the given function.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[i] ≤ 1000
Output
For each testcase print the sorted array in a new line.
Example
Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1
Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		while(k-- >0)
		{int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		
		bublesort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		         }         // Your code here
	}
	public static void bublesort(int a[],int n)
	{
		for(int i=0;i<(n-1);i++)
		{
			for(int j=0;j<(n-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	}
}