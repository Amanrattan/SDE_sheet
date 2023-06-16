package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DupicateValueInArray {

    private static int duplicatedArray(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+ 1);

            }
            else {
                map.put(arr[i],1);
            }

        }
        //this is for checking: map and key set

//        System.out.println(map);
//        System.out.println(map.keySet());

        //put the vlaue
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of a array:");
        int n = in.nextInt();

        int[] arr = new int[n+1];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < n+1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int res = duplicatedArray(arr);
        System.out.println(res);



    }


}
