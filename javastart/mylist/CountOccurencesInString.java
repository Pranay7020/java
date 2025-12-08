package mylist;

public class CountOccurencesInString {


    // time complexity best case = O(n) ,  space = O(1)
    public static void main(String[] args) {

        String s ="nikitiiia"; char target = 'p';
        int count = 0;

        for(int i =0; i< s.length();i++) {
            if(s.charAt(i) == target) {
                count ++;
            }
        }
        System.out.println(count);
    }
}