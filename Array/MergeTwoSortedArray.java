class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        mergeTwoSortedArray(arr1, arr2, m, n);
         for(int i=0;i<m+n;i++){
            System.out.print(arr1[i]+" ");
         }

    }

    static void mergeTwoSortedArray(int arr1[], int arr2[], int m, int n) {
        /*
         * Here we are going to use 3 Pointer based on 2 Pointer Approach;
         * 1- First pointer 'i' will be point to the last valid element of the First
         * array;
         * 2- Second pointer 'j' will be point to the last valid element of the Second
         * Array;
         * 3- Third Pointer 'k' will be point to the valid space that is blank in First
         * array's last position;
         * 4- now We compare the First and Second arrays's element as if(arr1[i]>
         * arr2[j]) if the element of the
         * First array will be large then we put it to the First array's last Position;
         * else we put the second array's element to the First Array's last position;
         * along with we decrement the i,j,k pointers respectively;
         * 
         */

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
    }

}