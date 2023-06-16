package array;

import java.util.Arrays;
import java.util.Scanner;

public class tripletThatsumtoagivenValue {

    private static int[] sumofarray(int[] arr, int k) {

        Arrays.toString(arr);
        int[] res = new int[3];

        for(int i =0;i < arr.length-1;i++){

            int l = i+1;
            int r = arr.length - 1;
            while( l < r){
                if(arr[i] + arr[l] + arr[r] == k){
                    res[0] = arr[l];
                    res[1] = arr[r];
                    res[2] = arr[i];
                    return res;
                }
                else if(arr[i] +arr[l] + arr[r] < k){
                    l++;
                }else{
                    r--;
                }
            }

        }
        return res;
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

        System.out.println("enter the sum:");
        int k = in.nextInt();

        //sumofarray(arr,k);
        int[] ans = sumofarray(arr, k);

        System.out.println(Arrays.toString(ans));
    }


}
