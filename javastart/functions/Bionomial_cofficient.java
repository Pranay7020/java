package functions;

import java.util.Scanner;

public class Bionomial_cofficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binofc(int n,int r){
         int f_n = factorial(n);
        int f_r = factorial(r);
        int f_n_r = factorial(n -r);

        int binofc = f_n / (f_r * f_n_r);
        return  binofc;

    }

    public static void main(String args[]) {
        int n = 5;
        int r = 2;

        System.out.println(binofc(n,r)); // ⭐ PRINT THE RESULT
    }
}
