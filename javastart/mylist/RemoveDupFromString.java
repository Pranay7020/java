package mylist;

public class RemoveDupFromString {

    public static void main(String[] args) {
        String s ="nikiiiiiikta";
        String n="";
        int[] freq = new int[256];
        for(char c: s.toCharArray()) {
            if(freq[c] == 0) {
                n=n+c;
            }
            freq[c]++;
        }
        
        System.out.println(n);
    }
    
}
