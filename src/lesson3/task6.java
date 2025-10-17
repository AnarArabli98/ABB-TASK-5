package lesson3;

import java.util.Scanner;

public class task6 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        boolean result = polindrome(s);

        if (result) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
    }
    public static boolean polindrome(String s) {
        s = s.toLowerCase();
        String reverse = "";


        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
