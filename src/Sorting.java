package src;

public class Sorting {

	public void bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					isSwapped = true;
					swap(arr, j, j + 1);
				}
			}
			if (!isSwapped) break;
		}
	}

	public void selectionSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			int minElemIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minElemIdx])
					minElemIdx = j;
			}
			swap(arr, i, minElemIdx);
		}
	}

	public void insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int selectedValue = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > selectedValue) {
				arr[j + 1] = arr[j--];
			}
			arr[j + 1] = selectedValue;
		}
	}

	public void mergeSort(int[] arr, int l, int h) {
		if (l < h) {
			int m = l + ((h - l) >> 1);
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, h);
			merge(arr, l, m, h);
		}
	}
	private void merge(int[] arr, int l, int m, int h) {
		int i = l, j = m + 1, k = 0;
		int[] aux = new int[h - l + 1];

		while (i <= m && j <= h) {
			if (arr[i] <= arr[j])
				aux[k++] = arr[i++];
			else
				aux[k++] = arr[j++];
		}
		while (i <= m)
			aux[k++] = arr[i++];
		while (j <= h)
			aux[k++] = arr[j++];

		for (i = 0, j = l; j <= h; i++, j++)
			arr[j] = aux[i];
	}

	public void quickSort(int[] arr, int l, int h) {
		if (l < h) {
			int pivot = partition(arr, l, h);
			// quickSort(arr, l, pivot); // this will also work
			quickSort(arr, l, pivot - 1);
			quickSort(arr, pivot + 1, h);
		}
	}
	private int partition(int[] arr, int l, int h) {
		int pivotIdx = l;
		int i = l, j = h;
		
		while (i < j) {
			while(i <= j && arr[i] <= arr[pivotIdx]) i++;
			while(j >= i && arr[j] > arr[pivotIdx]) j--;

			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, pivotIdx, j);

		return j;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
