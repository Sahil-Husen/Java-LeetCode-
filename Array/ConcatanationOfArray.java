public class ConcatanationOfArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int check[] = { 1, 2, 3 };
        int ans[] = concatenate(arr);
        System.out.println("**************************");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        System.out.println("**************************");
       int check1[] =  secondApproach(check);

       for(int i=0;i<check1.length;i++){
        System.out.print(check1[i]+" ");
       }
    }

    static int[] concatenate(int[] arr) {
        int n = arr.length;
        int ans[] = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            ans[i] = arr[i % n];
        }
        return ans;

    }

    static int[] secondApproach(int[] arr) {
        int len = arr.length;
        int len2 =2*len;
        int ans[] = new int[len2];

        for (int i = 0; i < len; i++) {
            ans[i] = arr[i];
            ans[i + len] = arr[i];
        }

        return ans;
    }

}
