package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNosThatSumsUptoK {

    private static int[] sumofarrays(int[] arr, int k) {

        Arrays.sort(arr);

        int[] res= new int[2];
        int i = 0;
        int j = arr.length -1;

        while( i < j){


            if(arr[i] + arr[j] == k){
                res[0] = arr[i];
                res[1] = arr[j];
                return res;
            }
            else if(arr[i] + arr[j] < k){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }

        public static void main (String[]args){
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

            int[] ans = sumofarrays(arr, k);

            System.out.println(Arrays.toString(ans));
        }
}
