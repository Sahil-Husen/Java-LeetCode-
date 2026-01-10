package EasyProblemsOnLeetcode;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(125));
        System.out.println(digital(192));
    }

    static int addDigits(int num) {
        int rev;
        int sum = 0;

        while (num > 9) {

            sum = 0;
            while (num > 0) {
                rev = num % 10;
                sum += rev;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    static int digital(int n) {
        if (n == 0)
            return 0;
        return 1 + (n - 1) % 9;
    }

}
