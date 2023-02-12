/*
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 106
0 <= Arr[i] <= 109

Sum of 'N' over all test cases does not exceed 106
Output
You need to return the sorted array. The driver code will print the array in sorted form.
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
public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  

        if(start < end){

            int mid = start + (end - start)/2;        //get the middle index
            
            implementMergeSort(arr, start, mid);
            implementMergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
        return arr;
    }

public static void merge(int arr[], int start, int mid, int end){

    int leftLength = mid - start + 1;
    int rightLength = end - mid;

    int[] leftSortedArray = new int[leftLength];
    int[] rightSortedArray = new int[rightLength];

    for(int i = 0 ; i< leftLength ; i++){
        leftSortedArray[i] = arr[start + i];
    }

     for(int i = 0 ; i< rightLength ; i++){
        rightSortedArray[i] = arr[mid + 1 + i];
    }

    int i=0,j=0,z=start;

    while(i < leftLength && j < rightLength){        //traverse both the arrays till length traversed is less than any of the arrays
        
        //compare the elements
        if(leftSortedArray[i] <= rightSortedArray[j]){  
            arr[z] = leftSortedArray[i];
            i++;
        }else {
            arr[z] = rightSortedArray[j];
            j++;
        }
        z++;
    }

    while(i < leftLength){          //check for the remaining length of left array
        arr[z] = leftSortedArray[i];
        i++;
        z++;
    }

    while(j < rightLength){          //check for the remaining right of left array
        arr[z] = rightSortedArray[j];
        j++;
        z++;
    }

}