package BitManipulation;

import java.util.Scanner;
//for return position when it encounter 1 (4 --> 100--> return 3 position)  on binary numbers
public class PositonOfOnlySetBit {

    private static boolean powerOf2(int n) {

        //count set bits in n
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n >>=1;
        }
        if(count == 1 ){
            return true;
        }
        return false;
//        return count == 1;
    }
    private static int findPosition(int n){
        if (!powerOf2(n)) {
            return -1;
        }
        int pos = 0;
        while(n > 0){
            pos++;
            n = n>>1;
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = findPosition(n);
        System.out.println(res);
    }


}
