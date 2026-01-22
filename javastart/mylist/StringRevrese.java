package mylist;

public class StringRevrese {

    // O(n) (array) + O(n/2)(while loop becoz it i decreasing)
            // = O(1.5n)
            // = O(n) -- Final time complexity

            //O(n) is space complexity becoz of array
    public static void main(String args[]) {
    //     String s= "nikita";
    //     char[] arr = s.toCharArray();
    //     int left = 0;int right =arr.length-1;
    //     while(left<right) {

    //         char temp = arr[left];
    //         arr[left]=arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }

        
    //     System.out.println(arr);

        int num=1234, rem =0, rev=0;
        while(num>0) {
            rem = num%10;
            rev= rev*10 +rem;
            num = num/10;
        }
        
        System.out.println(rev);


    }
    
}
