package array;

import java.util.Arrays;
import java.util.Scanner;

public class SumofSubarray {

    private static int subArrayMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;

        int n = arr.length;
        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j =i;j<n;j++){
                sum = sum + arr[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
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
        int res = subArrayMaxSum(arr);
        System.out.println(res);
    }


}
