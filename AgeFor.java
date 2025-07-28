public class AgeFor {
    public static void main(String[] args) {
        int currentYear = 2025;
        int[] birthYears = {2000, 2010, 1985, 1999, 2020};

        for (int i = 0; i < birthYears.length; i++) {
            int age = currentYear - birthYears[i];
            System.out.println("Person " + (i + 1) + " is " + age + " years old.");
        }
    }
}

