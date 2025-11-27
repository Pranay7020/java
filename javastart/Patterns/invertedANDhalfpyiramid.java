package Patterns;

public class invertedANDhalfpyiramid {


    
    public static void halfpyiramid (int n){

// outer loop
 for(int i=1;i<=n;i++){
  //inner loop 
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
   for(int k=1;k <= i;k++){
    System.out.print("*");
  }
  System.out.println();
 }



    }

    public static  void main (String args[]){
    halfpyiramid(4);

    }
    
}
