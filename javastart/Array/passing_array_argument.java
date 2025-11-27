package Array;

public class passing_array_argument {
    public static void Udate(int marks[], int nonchangeable){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
        nonchangeable=18;
    }
    public static void main(String[] args) {
        int marks []={97,98,99};     //   <-- call by reference

        int nonchangeable=45;     //   <-- call by value

        Udate(marks, nonchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]);
        }
        System.out.println("Nonchangeable value: " + nonchangeable);
    }
    
}
