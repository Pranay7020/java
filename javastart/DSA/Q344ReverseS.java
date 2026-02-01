package DSA;

public class Q344ReverseS {
    public static void main (String args[]){
        String name="pranay";
        char s[]=name.toCharArray();

        int i=0,j=s.length-1;
        while(i<j){
            char temp =s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;

        }
        for(int k=0;k<=s.length-1;k++){
            System.out.print(s[k]);
        }
    }
}
