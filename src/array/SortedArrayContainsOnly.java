package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedArrayContainsOnly {

    private static void sortArray(int[] arr) {
//        HashMap<Integer,Integer> map = new HashMap();
//
//        map.put(0,0);
//        map.put(1,0);
//        map.put(2,0);
//        int n = arr.length;
//        for(int i =0 ; i<n;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }else{
//                map.put(arr[i], 0);
//            }
//        }

        //tree map always sorted
        TreeMap<Integer,Integer> map = new TreeMap<>();

        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        int n = arr.length;
        for(int i =0 ; i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int j =0;

        for(int key : map.keySet()){
            for(int i = 0;i < map.get(key);i++){
                //here, j intial 0 so it is incremented according to the keys & printed in original array
                arr[j++] = key;
            }
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

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }


}
