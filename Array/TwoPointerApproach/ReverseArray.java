package Array.TwoPointerApproach;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        reverse(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            
                swap(arr, arr, i, j);
            
            i++;
            j--;

        }
    }

    static void swap(int arr1[], int arr2[], int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;

    }
}
