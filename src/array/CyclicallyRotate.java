package array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotate {

    private static void rotateArray(int[] arr, int k) {


        for(int i =0 ;i<k;i++){
            rotateArray(arr);
        }

    }

    private static void rotateArray(int[] arr) {

        int temp = arr[arr.length - 1];
        for(int i = arr.length-2;  i >=0 ;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    //2 way
    private static void reversalalgo(int[] arr, int k) {
        int n = arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
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

        System.out.println("enter the value of k: ");
        int k = in.nextInt();


//        rotateArray(arr,k);
//        System.out.println(Arrays.toString(arr));

        reversalalgo(arr,k);
        System.out.println(Arrays.toString(arr));
    }




}
