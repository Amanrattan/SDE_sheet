package array;




import java.util.Arrays;
import java.util.Scanner;

public class MinimumNoOfJumps {

    private static int reachendofarray(int[] arr) {
        return reachendofarray(arr, 0, 0, 0);
    }

    private static int reachendofarray(int[] arr, int s, int e, int jumpCount) {
        // Termination  Cond
        if(e >= arr.length -1 ){
            return jumpCount;
        }

        int maxjump =0;
        int ind =0;
        for(int i = s; i <= e;i++){
            if( arr[i] > maxjump){
                maxjump = arr[i];
                ind = i;
            }
        }

        return reachendofarray(arr, ind +1,maxjump + e,jumpCount+1);
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

       int res = reachendofarray(arr);
        System.out.println(res);
    }


}

