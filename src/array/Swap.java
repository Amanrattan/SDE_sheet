package array;
//ways to swaps 2 numbers
public class Swap {

    //1 way---> using +,-
    private static void swap1(int a, int b) {

        a = a+b;
        b = a-b;//we are using the updated value of a
        a = a-b;//we are using the updated value of b

        //System.out.println("a: " + a + " b: " + b);

        //in this copy by value goes so we print in method
    }

    //2 way-->using XOR
    private static void swap2(int a, int b) {
        //we can also use 3 varible
        //a's & b's vlaue converted into binary for XOR
        a=a^b;
        b=a^b;//also using updated value of a
        a=a^b;////we are using the updated value of b

        System.out.println("a: " + a + " b: " + b);
    }

    //3way
    private static void swap3(int a, int b) {
        //using temp
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        swap1(a,b);

        swap2(a,b);

        swap3(a,b);


    }
}
