#include <cstdlib>
#include <iostream>
#include "merge.h"
#include "mergeSort.h"

using namespace std;

void mergeSort(int *arr, int min, int max){
    if(min < max){
        int mid = (min + max)/2;
        mergeSort(arr, min, mid);
        mergeSort(arr, mid + 1, max);
        merge(arr, min, mid, max);
    }
}
