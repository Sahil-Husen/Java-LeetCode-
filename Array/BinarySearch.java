class BinarySearch {
    public static void main(String[] args) {

        int arr[] = { -1, 2, 4, 6, 8 };
        int target = 4;
        int res = binarySearch(arr, target);
        System.out.println(res);

    }

    static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}