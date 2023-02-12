/*
Problem Statement
Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.
Note: Use binary search to solve the problem
Input
The first line of input contains a number of test cases T. For each test case, the first line of input contains a number of elements in the array, and the number K is separated by space. The next line contains N elements.

Constraints:
1 <= T <= 10
1 <= N <= 105
1 <= K <= 109
1 <= arr[i] <= 109

Sum of N over all test cases doesn't exceed 106
Output
If the element is present in the array print "1" else print "-1".
Example
Sample Input:
2
5 6
1 2 3 4 6
5 2
1 3 4 5 6

Sample Output:
1
-1
*/
static int isPresent(long arr[], int n, long k)
{
	int start = 0, end = n - 1;
	int result = -1;
	while(start <= end){ //continue till searching
		int mid = start + (end - start) / 2;
		if(arr[mid] == k){
			result = 1;
			break;
		}
		else if(arr[mid] > k){//k is lesser, search in left side
			end = mid - 1;
		}
		else{//search in right side as k is greater
			start = mid + 1;
		}
	}
	return result;
}