package mylist;

public class UniqueSubStrings {
    public static void main(String[] args) {
        char[] s = {'n','i','t','n'};
        for(int i=0;i<s.length;i++) {
            boolean dup[]=new boolean[256];
            String sub = "";
            for(int j=i;j<s.length;j++) {
                char c = Character.toLowerCase(s[j]);
                if(dup[c]) {
                    break;
                }
                sub =sub+c;
                dup[c] =true;
            }

            System.out.println(sub);
        }
        

    }
    
}
