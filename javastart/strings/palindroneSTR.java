package strings;

public class palindroneSTR {
    public static boolean palindrone(String str){
        for(int i=0;i<=str.length();i++){
            int n=str.length();
            if(i==n-1+i){
                return true;

            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="pranay";
        
        System.out.print(palindrone(str));

    }
}
