public class Algorithms {
    public static void main(String[] args) {
        
        // Insertion-Sort
        int[] insArr = {5,2,4,6,1,3};
		System.out.println("Insertion Sort: " + Arrays.toString(insertionSort(insArr)));
		System.out.println("Insertion Sort in nonincreasing order: " + Arrays.toString(nonincreasingInsertionSort(insArr)));
        
    }
    public static int[] insertionSort(int[] arr) {
		for(int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		return arr;
	}
	
	public static int[] nonincreasingInsertionSort(int[] arr) {
		for(int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] < key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		return arr;
	}
}
