package array;

import java.util.Arrays;
import java.util.Scanner;

public class DifferencebtwHeights {

    private static void heightdifference(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int maxHeights = arr[n-1];
        int minHeights = arr[0];


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

        heightdifference(arr);
    }


}
