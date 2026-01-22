package mylist;

public class Fibonacci {


    //Time	O(n)
    // Space	O(1)
    public static void main(String args[]) {
        // int n =10;
        // int a=0,b=1;
        // System.out.print(a+ " " +b);
        // for(int i =2; i<=n;i++) {
        //     int c = a+b;
        //     System.out.print(" " +c);
        //     a=b;
        //     b=c;
        // }

        // int a=0, b=1;;
        
        // for(int i=0;i<10;i++) {
        //     System.out.print(a+", " );
        //     int c = a+b;
        //     a = b;
        //     b = c;
            
        // }

        int a=0,b=1;
        for(int i =0;i<10;i++) {
            System.out.print(a + ", ");
            int c =a+b;
            a = b;
            b =c;
        }

        
    }
    
}
