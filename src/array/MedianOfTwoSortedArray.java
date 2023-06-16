package array;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArray {

    private static int mediansorted(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        int[] c= new int[a.length + b.length];
        int k =0;

        while( i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

            while(i < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
            while(j < b.length){
                c[k] = b[j];
                j++;
                k++;
            }

           int mid = c.length / 2;
            if( c.length % 2 == 0){
               return (c[mid] + c[mid - 1])/2;
            }
            else{
                return c[mid];
            }

//        return c;

    }
    public static void main(String[] args) {
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

//        int[] c = mediansorted(a,b);

   //     System.out.println(Arrays.toString(c));

          int res = mediansorted(a,b);
          System.out.println(res);

    }


}
