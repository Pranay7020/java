package mylist;

public class Practise {

    public boolean check(String s) {
        char[] arr = s.toCharArray();

        int left =0; int right = arr.length-1;
        while(left<right) {
            if(arr[left] != arr[right]) {
                return false;
            } 
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "aba";
        // char[] arr = s.toCharArray();

        // int left =0; int right = s.length() -1;
        // while(left<right) {
        //     char temp = arr[left];
        //     arr[left] = arr[right];;
        //     arr[right] = temp;
        //     left++;
        //     right--;
        // }
        // System.out.println(arr);
        Practise p = new Practise();
        boolean b = p.check("nikita");
        System.out.println(b);  
        
        

        


    }
    
}
