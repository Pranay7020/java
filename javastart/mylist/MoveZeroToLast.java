package mylist;

// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class MoveZeroToLast {
    public static void main(String args[]) {
        int[] arr = {1,0,-3,8,-0,0,5,7};
        int[] zero = new int[arr.length];
        int j =0;
        for(int i =0; i<arr.length;i++) {
            if(arr[i] != 0)  {
                zero[j++] = arr[i];
            }
        }
        while(j<arr.length) {
            zero[j++]=0;
        }
        for(int i=0;i<zero.length;i++) {
            System.out.println(zero[i]);
         }

        //  List<Integer> arrList = List.of(1,0,-3,8,-0,0,5,7);

        // List<Integer> MoveZeroToLast = Stream.concat(arrList.stream().filter(n -> n != 0),
        // arrList.stream().filter(n -> n==0)).collect(Collectors.toList());

        // System.out.println(" " +MoveZeroToLast);

        // //O(n)

        //  int[] arr = {1,0,-3,8,-0,0,5,7};
       
        //  int[] zero = new int[arr.length];
        //  int j=0;
        //  for(int i=0;i<arr.length;i++) {
        //     if(arr[i]!=0) {
        //         zero[j++] = arr[i];
        //     }
            
        //  }
        //  while(j<zero.length-1) {
        //         zero[j++] = 0;
        //     }
        //  for(int i=0;i<zero.length;i++) {
        //     System.out.println(zero[i]);
        //  }

    }   
}
