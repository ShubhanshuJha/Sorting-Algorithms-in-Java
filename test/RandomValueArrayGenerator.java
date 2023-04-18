
public class RandomValueArrayGenerator {
	int n;
    int arr[];
    public RandomValueArrayGenerator(int n) {
        this.n = n;
        arr = new int[n];
    }

    public int[] random() {
        int limit = 10000;
        if (limit <= n)
            limit = ((n << 1) + (n >> 1));

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * limit) + 1;
        }
        return arr;
    }
}