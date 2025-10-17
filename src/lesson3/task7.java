package lesson3;

import java.util.Scanner;

public class task7 {
    static void main() {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toLowerCase();


        System.out.println("Netice : ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

        if(!Character.isLetter(c)) {
            continue;
        }

        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == c) {
                count++;
            }
        }
        if(s.indexOf(c) == i) {
            System.out.println(c + " : " + count);
        }
        }
    }
}
