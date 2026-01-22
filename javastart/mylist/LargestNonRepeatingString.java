package mylist;

public class LargestNonRepeatingString {

    public static void main(String[] args) {
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
