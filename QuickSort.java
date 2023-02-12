/*
Problem Statement
Given an array A[] having N positive integers. You need to arrange these elements in increasing order using Quick Sort algorithm.
Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function quickSort() which contains following arguments.

A[]: input array
start: starting index of array
end: ending index of array

Constraints
1 <= T <= 1000
1 <= N <= 10^4
1 <= A[i] <= 10^5

Sum of "N" over all testcases does not exceed 10^5
Output
For each testcase you need to return the sorted array. The driver code will do the rest.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
*/
/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
//[10, 30, 20, 70, 5, 40, 35]
public static int partition(int arr[], int start, int end){
    int pivot = arr[end];
    int i = start - 1; //this index is for all elements in left part
    //i is the index of smaller element

    //[10, 30, 20, 5, 70, 40, 35]
    //start = 0, end = 6, pivot = 35
    //i = 3, j = 6
    //for loop basically brings all lesser elements in left part
    //i will be pointing at last position of left array
    for(int j = start; j <= end - 1; j++){
        if(arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //[10, 30, 20, 5, 70, 40, 35]
    //Pivot element to be placed after the left array ends.
    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;

    return i+1;
}


public static int[] quickSort(int arr[], int start, int end)
{       
        if(start < end){
            //placing the pivot element in correct position
            //p is the index of the pivot element.
            //sorting [all lesser elements tha pivot, pivot, all greater elements than pivot]
            int p = partition(arr, start, end); 

            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
        return arr;
}