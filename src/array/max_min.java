package array;
//time compexity: O(n)
//space compexity: O(1)
import java.util.Arrays;
import java.util.Scanner;

public class max_min {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    private static void MaxMin(int[] arr) {


        System.out.println("Max" + max +"\n"+ "Min" + min);
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                //arr[i] have maximum vlaue so we r puting it into the max
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max" + max +"\n"+ "Min" + min);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of a array:");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("enter arrays elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        MaxMin(arr);
    }


}
