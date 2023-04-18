import src.Sorting;
import java.util.Scanner;
import static java.lang.System.*;


public class TestSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Enter the number of test cases: ");
        int test = input.nextInt();
        while (test-- > 0) {
            out.print("Enter the size of the array: ");
            int n = input.nextInt();
            int[] arr = new RandomValueArrayGenerator(n).random();
            out.println("The input array is:");
            printArr(arr);

            new Sorting().mergeSort(arr, 0, n - 1);
            // new Sorting().quickSort(arr, 0, n - 1);
            // new Sorting().bubbleSort(arr, n);
            // new Sorting().selectionSort(arr, n);
            // new Sorting().insertionSort(arr, n);

            out.println("After Sorting, the array is:");
            printArr(arr);
        }
        input.close();
    }

    private static void printArr(int[] arr) {
        for (int j : arr) {
            out.print(j + " ");
        }
        out.println();
    }
}

