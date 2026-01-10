package BitManipulation;

public class SingleNumber {

    // here we are going to solve the problem to find single number IN O(N) time
    // complexity
    // Here we will use the concept of Bit Manipulation
    // Same Numbers can be eleminated and the odd one will be return by the function

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 5 };
        int res = singleNumber(arr);
        System.out.println(res);

    }

    static int singleNumber(int[] arr) {
        int val = arr[0];

        for (int i = 1; i < arr.length; i++) {
            val = val ^ arr[i];
        }
        return val;
    }

}
