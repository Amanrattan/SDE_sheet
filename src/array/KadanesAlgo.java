package array;

import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgo {

    private static int sumofsubarray(int[] arr) {
//        int currsum=0;
        //int maxsum=0;

        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i =0;i <arr.length;i++){

            currsum = currsum + arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }

        return maxsum;
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

        int res = sumofsubarray(arr);
        System.out.println(res);
    }


}
