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

        // int[] arr = {4,1,100,4,10,2,1};

        // int max = arr[0];
        // for(int i=0;i<arr.length-1;i++) {
        //     if(arr[i]>max) {
        //         max = arr[i];
        //     }
        // } System.out.println(max);

        // swapping 2 numbers using 2 var
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " " +b);

        int[] arr = {4,1,100,4,0,10,2,1};

        int min=arr[0];
        for(int i =0;i<arr.length;i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min + " ");




        
    }
    
}
