package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    private static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :");
        int n = sc.nextInt();
        System.out.println("Representation of 1's in binary number:");
        int res = countSetBits(n);
        System.out.println(res);
    }
}
