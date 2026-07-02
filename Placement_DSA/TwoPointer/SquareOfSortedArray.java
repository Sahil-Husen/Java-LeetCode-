package Placement_DSA.TwoPointer;

public class SquareOfSortedArray {
    public static void reverse(int arr[], int size) {
        int i = 0;
        int j = size - 1;
        //
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] squareOfSortedArray(int arr[]) {
        int n = arr.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int pos = 0, neg = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[neg++] = arr[i];
            } else {
                arr1[pos++] = arr[i];
            }
        }

        for (int i = 0; i < pos; i++) {
            arr1[i] *= arr1[i];
        }
        for (int i = 0; i < neg; i++) {
            arr2[i] *= arr2[i];
        }

        reverse(arr2, neg);
        int res[] = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        // here is the logic of mergeTwoSortedArray

        while (i < pos && j < neg) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < pos) {
            res[k++] = arr1[i++];

        }
        while (j < neg) {
            res[k++] = arr2[j++];
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int res[] = squareOfSortedArray(arr);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }

}
