package Recursion;

public class PrintIncOrder {
    public static void PrintIncorder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintIncorder(n-1);
         System.out.print(n+" ");

    }
    public static void main(String args[]){
        int n=10;
        PrintIncorder(n);

    }
}
