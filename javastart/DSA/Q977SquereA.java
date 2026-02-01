package DSA;

public class Q977SquereA {

    public static int[] reverse(int arr[]) {
        int rev[] = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                rev[k] = arr[i] * arr[i];
                i++;
            } else {
                rev[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        return rev;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int result[] = reverse(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
