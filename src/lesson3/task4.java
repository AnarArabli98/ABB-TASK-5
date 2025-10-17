package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Tersi : " );
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
