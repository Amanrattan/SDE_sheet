package BitManipulation;

import java.util.Scanner;

public class CopySetBitsInRange {
    private static int copySetBits(int a, int b, int l, int r) {
        //base case
        if( l < 1 || r >32){
            return a;
        }
        for(int i = l; i<=r;i++){
            int mask = i <<1;
            if((b & mask) != 0){
                a = a | mask;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First No:");
        int a = sc.nextInt();
        System.out.println("Second No:");
        int b = sc.nextInt();
        System.out.println("enter range:");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int res = copySetBits(a,b,l,r);
        System.out.println(res);
    }


}
