package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Union_Intersection {

    private static int[] union(int[] arr,int[] arr1) {
        int i = 0;
        int j = 0;

        int[] c= new int[arr.length + arr1.length];
        int k =0;

        while(i < arr.length && j < arr1.length){
            if(arr[i] < arr1[j]){
                c[k] = arr[i];
                i++;
                k++;
            }
            else{
                c[k] = arr1[j];
                j++;
                k++;
            }
        }
        while(i < arr.length){
            c[k] = arr[i];
            i++;
            k++;
        }

        while(j < arr1.length){
            c[k] = arr1[j];
            j++;
            k++;
        }
        return c;
    }

    private static int[] intersection(int[] arr, int[] arr1) {

        int i=0;
        int j =0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < arr.length && j < arr1.length){
            if(arr[i] == arr1[j]){
                list.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] < arr1[j]) {
                i++;
            }else{
                j++;
            }
        }

        int[] res = new int[list.size()];
        int k = 0;
        for(int val : list){
            res[k++] = val;
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


        //2 array

        System.out.print("enter size of a array:");
        int m = in.nextInt();

        int[] arr1 = new int[m];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        int[] c = union(arr,arr1);
//        System.out.println("Sorted array:");
//        System.out.println(Arrays.toString(c));

        int[] res = intersection(arr,arr1);
        System.out.println("intersection array:");
        System.out.println(Arrays.toString(res));
    }




}
