package condistional_stmt;
import java.util.*;
public class ternary_operator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
    
        int max=(a>b)?a:b;
        System.out.println("Maximum is "+max);
    }
}
