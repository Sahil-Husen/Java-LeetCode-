package Sliding_Window;

public class GenerateAllString {
    public static void generate(String str) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                b.setLength(0);
                for (int k = i; k <= j; k++) {
                    b.append(str.charAt(k));
                }
                System.out.println(b.toString());
            }

        }

    }

    public static void main(String[] args) {
        String str = "abcd";
        generate(str);
    }
}
