package mylist;

import java.util.Arrays;

public class CountOccurencesInString {

    public boolean check(String s) {
        
        char[] arr = s.toCharArray();

        int left =0;int right = s.length()-1;
        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;

        } return true;
    }


    // time complexity best case = O(n) ,  space = O(1)


    public static void main(String[] args) {

    // int array[]={2,4,6,8,10};
    // pair(array);

    // char[] s = {'n','i','t','m','k','M','t','T','n','z','n','n','a'};
    // String n ="";
    // boolean dup[] = new boolean[256];

    // for(int i =0;i<s.length;i++) {
    //     char c = Character.toLowerCase(s[i]);
    //     if(!dup[c]) {
    //        dup[c] = true;
    //        n = n + c; 
    //     }
    // }
    //     System.out.println(" " + n);


        int[] arr = {4,5,3,2,4,5,6,7,5};
        Arrays.sort(arr);
        int count=1;
    
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]) {
                count++;
              
            } else {
                if(count>1) {
                    System.out.println(arr[i-1] + " "+ count );
                }count=1;
                
            } 
        }
        if(count>1) {
            System.out.println(arr[arr.length-1] + " "+ count );
        }

        


        // for(int i=0;i<arr.length;i++){
        //     int count =0;
        //     if(dup[i]) continue;
        //     for(int j=i;j<arr.length;j++) {
        //         if(arr[i] == arr[j] ) {
        //             count++;
        //             dup[j]=true;
        //         }
        //     }
        //     if(count >1) 
        //     System.out.println(arr[i]+ " " + count);

        // }

    }
}