package functions;

public class BinaryToDecimal {

    public static void bintodec(int mynum) {
        int decNum = 0;
        int pow = 0;
        int original = mynum;   // store original value

        while (mynum > 0) {
            int lastDigit = mynum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            mynum = mynum / 10;  
        }

        System.out.println("Binary: " + original + " → Decimal: " + decNum);
    }

    public static void main(String args[]) {
        bintodec(111);
    }
}
