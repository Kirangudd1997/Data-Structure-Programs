/*
Problem Statement
Given an array A[], size N containing positive integers. You need to arrange the elements of array in increasing order.
Input
First line of the input denotes number of test cases 'T'. First line of the test case is the size of array and second line consists of array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3
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
		
		SelectionSort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	 }         // Yo
                      // Your code here
	}
	public static void SelectionSort(int a[],int n)
	{
		for(int i=n-1;i>0;i--)
		{
			int Max_index=i;
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[Max_index])
				{
					Max_index=j;
				}
			}
			int temp=a[i];
			a[i]=a[Max_index];
			a[Max_index]=temp;
		}
	}
}