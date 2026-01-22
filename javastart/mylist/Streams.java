package mylist;

public class Streams {

    public static void main(String args[]) {
String fi="level";
int i=0;
int j=fi.length()-1;
boolean isp=true;
while(i<j){
    if(fi.charAt(i)!=fi.charAt(j)){
      isp=false;
      break;
    }
  i++;
  j--;
}

if(isp==true){
      System.out.print("your word palindrom ");

}
else {
      System.out.print("your word is not palindrom ");
}
}


}     

    
