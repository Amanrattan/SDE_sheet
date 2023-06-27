package BitManipulation;

import java.util.Scanner;

public class NonRepeatingElements {
    private static int detectionRepeatedElements(int[] arr) {
        int res = 0;
        for(int i = 0;i <=arr.length - 1;i++){
            res = res^arr[i];
        }
        return res;
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
       int[] arr={7,2,4,2,4};
       int res = detectionRepeatedElements(arr);
        System.out.println(res);
    }


}
