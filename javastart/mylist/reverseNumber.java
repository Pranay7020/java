package mylist;

public class reverseNumber {
    public static void main(String[] args) {

        int num = 1234;
        int rem =0, rev =0 ;
        while(num>0) {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
        //     int a= 10, b =20;

        //     a = a+b;
        //     b =a-b;
        //     a =a-b;
        //    System.out.println(a + " " +b); 



    }
 
}
