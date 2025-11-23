package functions;

public class prime  {

    public static boolean primis(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(primis(2));
    }
}
