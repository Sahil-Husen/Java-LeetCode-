package BitManipulation;

public class NumberOfOneBits {
    public static void main(String[] args) {
            int n = 5;
            System.out.println(numberOfOnes(n));
    }

    static int numberOfOnes(int n){

        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }

        return count;
    }
}
