package mylist;

public class MaxNumberInArray {


    //Time complexity = O(n) and space complexity = O(1) -- becoz used only 1 extra variables
    public static void main(String arg[]) {

        //Max
        // int[] arr = {4,1,2,4,10,2,1};

        // int max = arr[0];
        // for(int i =0;i<arr.length;i++) {
        //     if(arr[i] > max ) {
        //         max = arr[i];
        //     }
        // }

        // System.out.println(max);

        int[] arr = {4,1,2,4,10,2,1};

        int min = arr[0];
        for(int i =0;i<arr.length;i++) {
            if(arr[i] < min ) {
                min = arr[i];
            }
        }

        System.out.println(min);

    }
    
}
