
package strings;

public class inputOutput {
    public static void main(String args[]){
        String name="levep";
       int i=0;
       int j=name.length()-1;
       boolean isp=true;
       while(i<j){
        if(name.charAt(i)!=name.charAt(j)){
        
       
         isp=false;
        }
         i++;
         j--;
 
       }
       if(isp==true){
        System.out.print("is palinderom");
       }
       else{
   System.out.print(" not is palinderom");
       }
    }
}
