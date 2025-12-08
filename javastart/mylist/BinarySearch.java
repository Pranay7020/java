package mylist;

public class BinarySearch {

    // Time: O(log n)
    // Space: O(1)

    public int search(int arr[], int a) {
      int min = 0, max = arr.length -1;
      while(min <= max) {
        System.out.println(": " + min);
        int mid = min+(max -min)/2;  //min + (max - min)/2 avoids this because max - min is guaranteed to be smaller than or equal to max, so it won't overflow
        if(arr[mid] == a) { return mid;}
        else if( a > arr[mid]) {min = mid +1;}
        else max = mid -1; 
      } 
      return -1;
    }

    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7,8} ;
         
        BinarySearch B =new BinarySearch();
        int mid = B.search(a, 3);
        if(mid > -1) {
            System.out.println("Found at: " + mid);
        } else {
            System.out.println("Not Found ");
        }
    }
    
}
