public class SuffleArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int ans[] = suffleArray(arr, n);

        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
    }

    static int[] suffleArray(int[] arr, int n) {
        int ans[] = new int[n*2];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            ans[pos] = arr[i];
            ans[pos + 1] = arr[i + n];
            pos += 2;

        }

        return ans;
    }
}
