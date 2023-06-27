package BitManipulation;

import java.util.Scanner;

public class BitsConvertAToB {

    private static int flippedBits(int a, int b) {
        //method 1:
//        int n = a ^ b;
//        //count set bits in n
//        int count = 0;
//        while(n > 0){
//            if((n&1) == 1){
//                count++;
//            }
//            n >>=1;
//        }
//        return count;


        //method 2:
        int count = 0;
        while( a > 0 && b > 0){
            if((a & 1) != (b & 1)){
                count++;
            }
            a >>= 1;
            b >>=1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First No:");
        int a = sc.nextInt();
        System.out.println("Second No:");
        int b = sc.nextInt();
        int res = flippedBits(a,b);
        System.out.println(res);
    }


}
