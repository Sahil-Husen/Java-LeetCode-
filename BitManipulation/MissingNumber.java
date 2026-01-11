package BitManipulation;

public class MissingNumber {


     /*
         * Here there are 2 methods to solve this problem
         * 1- We can apply the '1 to n ' Sum formula and Array's Element sum;
         * '1 to n' sum and subtract with array's element sum;
         * finally we can get the missing Number;
         * 2- We can use the XOR Method
         * Where we take the xor of 1 to n series and store it in a variable
         * then we xor the each array element and store the another variable
         * finally subtract both you will get;
         */


    public static void main(String[] args) {
        int arr[]  = {3,0,1};
        System.out.println(missingNumber1(arr));
        System.out.println("Xor method");
        System.out.println(missingNumberXor(arr));
    }

    static int missingNumber1(int arr[]) {
       
        int n = arr.length;
        int nthSum = (n*(n+1))/2;
        int arraySum =0;
        for(int i=0;i<n;i++){
            arraySum+=arr[i];
        }

        return nthSum- arraySum;
    }   


    static int missingNumberXor(int[] arr){
        int x1 = 0;
        int x2 = 0;
        int n = arr.length;

        for(int i=1;i<=n;i++){
            x1^=i;
        }
        for(int i=0;i<n;i++){
            x2^=arr[i];
        }
        return x1^x2;
    }

}
