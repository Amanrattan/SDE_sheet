package array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    private static void reverseArray(int[] arr){
        int n = arr.length;
        int[] brr= new int[n];

        for (int i = n-1; i >= 0; i--) {
            brr[n-1-i] = arr[i];
        }

        for(int i = 0;i <n;i++){
            //we are updating the original array by puting the values of brr to arr
            arr[i] = brr[i];
        }
    }

    private static void reverseArray1(int[] arr){

//        int start = 0;// starting index
//        int end = arr.length - 1;
//         while(start <= end){
//             int temp = arr[start];
//             arr[start] = arr[end] ;
//             arr[end] = temp;
//             start++;
//             end--;
//         }

        for(int start= 0,end=arr.length -1; start<=end; start++,end--){
            int temp = arr[start];
             arr[start] = arr[end] ;
             arr[end] = temp;
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


//        reverseArray(arr);
       // System.out.println(Arrays.toString(arr));

        reverseArray1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
