package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedAraays {

    private static void sortedarray(int[] a, int[] b) {

        int i = 0;
        int j = 0;

        while( i < a.length && j <b.length){

            if(a[i] <= b[j]){
                i++;

            }

            else{
                //swap
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;

                Arrays.sort(b);
            }
        }

    }
    //without extra space
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of a array:");
        int n = in.nextInt();

        int[] a = new int[n];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(a));


        //2 array

        System.out.print("enter size of a array:");
        int m = in.nextInt();

        int[] b = new int[m];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(a) +" "+ Arrays.toString(b));
        sortedarray(a ,b);
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(a) +" "+ Arrays.toString(b));
    }


}
