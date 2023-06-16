package array;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Kth_maxmin {


    static int max;
    static int min;

    private static void kthmaxmin(int[] arr,int k) {
        int n = arr.length;
        Arrays.sort(arr);

        min = arr[k-1];
        max = arr[n - 1 - (k - 1)];

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

        System.out.println("enter the value of a k: ");
        int k = in.nextInt();

        kthmaxmin(arr, k);

        System.out.println("MIN: " + min +"\n"+ "MAX: " + max);

    }


}
