package Array;

public class MaxSubarray1 {

    public static void maxSubarray(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currsum = 0;

                for (int k = i; k <= j; k++) {
                    currsum += numbers[k];
                }

                System.out.println(currsum);

                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Subarray Sum = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}
