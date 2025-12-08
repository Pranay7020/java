package mylist;

public class PalindromeString {

    //Time complexity = O(n) and space complexity = O(1) -- becoz used only 2 variables
    public boolean fun(String s) {
        int left =0; int right =s.length()-1;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // char c1 = Character.toLowerCase(s.charAt(left)); // for case sesitive
            // char c2 = Character.toLowerCase(s.charAt(right));
            // if(c1 != c2) {
            //     return false;
            // }

            left ++;
            right --;    
        }
        return true;
        }
    public static void main(String[] args) {
        PalindromeString p =new PalindromeString();
        System.out.println(p.fun("nIN")); 
        
    }


    
}
