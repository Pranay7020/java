package mylist;

public class LinearSearch {

    // time = O(n) space = O(n)
    public boolean find(int arr[], int a) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == a) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        LinearSearch l =new LinearSearch();
        int arr[] = {20,100,55,-1,87,20};
        Boolean a = l.find(arr, -2);
        if(a) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }   
    }
    
}
