package mylist;

import java.util.Arrays;

public class CountFreqOfNo {

    public static void main(String[] args) {

        //without sorting if we want to preerve insertion order O(n2)
        // int arr[] = {1,7,5,8,3,1,6,1,7,5};
       // boolean[] repeat = new boolean[arr.length];

        // for(int i =0 ;i<arr.length;i++) {
        //     if(repeat[i]) continue;
        //     int count =1;
        //     for(int j =i+1 ;j<arr.length;j++) {
        //         if(arr[i] == arr[j]) {
        //             count++;
        //             repeat[j] = true;
        //         }
        // }
        //     if(count> 1) {
        //         System.out.println(arr[i] + " " +count);
        //     }
        
        // }

        //with sorting if we dont want to preerve insertion order O(n log n)
         int arr[] = {1,7,5,8,3,1,6,1,7,5};
         Arrays.sort(arr) ;
         int count =1;

         for(int i=1;i<arr.length;i++) {
            if(arr[i]== arr[i-1]) {
                count++;
            } else {
                if(count >1 ) {
                    System.out.println(arr[i-1] + " " +count);
                }
                count =1;
                
            }
            
         }
         if(count >1 ) {
            System.out.println(arr[arr.length-1] + " " +count);
         }

}
    
}
