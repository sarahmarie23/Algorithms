#include <cstdlib>
#include <iostream>
#include <climits>
#include "merge.h"

using namespace std;

void merge(int *A, int min, int mid, int max){
    // Find the lengths of the two subarrays. I like to think of it as a left and right half.
    int leftLength = mid - min + 1;
    int rightLength = max - mid;

    // Initialize the two arrays. Extra length is for the sentinels.
    int *leftArr = new int[leftLength+1];
    int *rightArr = new int[rightLength+1];

    // Copying the left half of the subarray.
    for(int i = 0; i < leftLength; i++){
        leftArr[i] = A[min + i];
    }

    // Copying the right half of the subarray.
    for(int j = 0; j < rightLength; j++){
        rightArr[j] = A[mid + j + 1];
    }

    // Putting sentinels at the ends of the left and right arrays.
    leftArr[leftLength] = INT_MAX;
    rightArr[rightLength] = INT_MAX;

    // Initializing starter indexes for each array.
    int leftIndex = 0;
    int rightIndex = 0;

    // Writing the values into the main array from the left and right halves.
    for(int k = min; k <= max; k++){
        if(leftArr[leftIndex] <= rightArr[rightIndex]){
            A[k] = leftArr[leftIndex];
            leftIndex++;
        } else {
            A[k] = rightArr[rightIndex];
            rightIndex++;
        }
    }

    // Deallocating memory.
    delete [] leftArr;
    delete [] rightArr;

}
