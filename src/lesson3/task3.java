package lesson3;

import java.util.Scanner;

public class task3 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    System.out.println("[" + i + "][" + j + "][" + k + "]");
                    arr[i][j][k] = input.nextInt();

                }
                }
            }
        System.out.println("Elementler");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("  {");
                for (int k = 0; k < arr[0][0].length; k++) {

                    System.out.print(arr[i][j][k]);
                    if (k!=arr[0][0].length-1) System.out.print(" , ");
                }
                System.out.println("}");
            }
            System.out.println("}");
        }

        System.out.println("6 dan boyukler:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    if (arr[i][j][k] > 6) {
                        System.out.print(arr[i][j][k]);
                        if (k!=arr[0][0].length-1) System.out.print(" , ");
                    }
                }
            }
        }
        }

    }
