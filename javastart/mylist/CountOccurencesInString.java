package mylist;

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

    char[] s = {'n','i','t','m','k','M','t','T','n','z','n','n','a'};
    String n ="";
    boolean dup[] = new boolean[256];

    for(int i =0;i<s.length;i++) {
        char c = Character.toLowerCase(s[i]);
        if(!dup[c]) {
           dup[c] = true;
           n = n + c; 
        }
    }
        System.out.println(" " + n);
    }
}