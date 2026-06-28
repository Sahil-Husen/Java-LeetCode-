package Placement_DSA.TwoPointer;

public class RemoveDuplicate {
    public static int removeDuplicate(int arr[]) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {

                j++;
            } else {
                arr[i + 1] = arr[j];
                i++;
                j++;
            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        int res = removeDuplicate(arr);
        for (int i=0;i<res;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
