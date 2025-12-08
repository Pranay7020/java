package mylist;

public class BubbleSort {


    // time complexity best case = O(n) , worst case =O(n²), space = O(1)
    public static void main(String[] args) {
        int arr[] ={10,5,3,1,60,8,-1};

        for(int i=0;i< arr.length;i++) {
            boolean swapped = false;

            for(int j =0;j < arr.length -1 ;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) { break;}

        }
        for(int a : arr) {
            System.out.print(a +" ");
        }
        
    }
    
}
