package TwoDArray;

class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 4, 5 } };
        int targer = 4;
       boolean res =  searchMatrix(matrix, targer);
        System.out.println(res);
    }

    static public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int low = 0;
    int high = rows * cols - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Convert 1D index to 2D index
        int midValue = matrix[mid / cols][mid % cols];

        if (midValue == target) {
            return true;
        } else if (midValue < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return false;
}

}