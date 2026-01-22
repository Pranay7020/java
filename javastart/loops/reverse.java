package loops ;
class Linkedlist{
 class Node{
   int data;
   Node next;
    
   public Node(int data){
   this.data=data;
   this.next=null;
   }
   
 }
 public static Node Head;
   public static Node Tail;
   public void addfirst( int data){
 Node newnode=new Node(data);
if(Head==null){
   Head=Tail=newnode;
   return;
}
newnode.next=Head;
Head=newnode;
     }  

 public static void main(String args[]){
 Linkedlist LL= new Linkedlist();
 LL.addfirst(2);
 LL.addfirst(0);

 
 }


}