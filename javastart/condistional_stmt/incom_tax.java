package condistional_stmt;

public class incom_tax {
    public static void main(String args[]){
        int income=250000;
        if(income<=250000){
            System.out.println("No tax");
        } else if(income>250000 && income<=500000){
            System.out.println("5% tax");
        } else if(income>500000 && income<=1000000){
            System.out.println("20% tax");
        } else {
            System.out.println("30% tax");
        }

    }
}
