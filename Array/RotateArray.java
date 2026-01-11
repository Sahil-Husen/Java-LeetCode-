package Array;

 

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 9;

        rotateArray(arr, k);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    static void reverse(int arr[], int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // we use k = k % n primarily to calculate the effective rotation count and
                   // prevent unnecessary work or errors

        reverse(arr, 0, n - 1); // Reverse entire array
        reverse(arr, 0, k - 1); // Reverse first k elements
        reverse(arr, k, n - 1); // Reverse remaining elements

    }
}
