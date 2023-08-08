package Sorting.CyclicSorting;

public class miissingNumber {

    public static void main(String[] args) {
        int[] arr={0,4,2,1};
        System.out.println(miissingNumber(arr));
    }

    public static int miissingNumber(int[] arr) {

        int i =0;
        while (i < arr.length){
            int correct = arr[i];//not used - 1

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i ,correct);
            }
            else{
                i++;
            }
        }
        
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }

        //case 2
        return arr.length;

    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}

