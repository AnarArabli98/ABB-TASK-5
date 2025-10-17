package lesson3;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        int xdiognal = 0;
        int ydiognal = 0;

        int m =  arr.length;
        for(int j=0;j<m;j++){
            xdiognal += arr[j][j];
            ydiognal += arr[j][m-1-j];
        }

        System.out.println("xdiognal " + xdiognal);
        System.out.println("ydiognal  " + ydiognal);

    }
}
