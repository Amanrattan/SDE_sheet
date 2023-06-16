package array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeOneSide {

    private static void moveoneside(int[] arr) {
        int i= 0;
        int j =0;
//        while( j < arr.length-1)
        while(!(j > arr.length - 1)){
            if( arr[j] < 0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of a array:");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        moveoneside(arr);

        System.out.println(Arrays.toString(arr));
    }


}
