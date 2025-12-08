package mylist;

public class StringRevrese {

    // O(n) (array) + O(n/2)(while loop becoz it i decreasing)
            // = O(1.5n)
            // = O(n) -- Final time complexity

            //O(n) is space complexity becoz of array
    public static void main(String args[]) {
        String s= "nikita";

        char[] arr = s.toCharArray();
        int left = 0; int right = s.length()-1;

        while(left < right) {
            char temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left ++;
            right--;
        }
        System.out.println(arr);

    }
    
}
