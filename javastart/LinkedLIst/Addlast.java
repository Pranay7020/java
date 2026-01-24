package LinkedLIst;

public class Addlast {
    public static class Node{
        int data ;
        Node next;
        public  Node(int data){
          this.data=data;
          this.next=null;
        }


    }
    public  static Node Head;
     public  static Node Tail;

      public void addend(int data){
        Node newnode =new Node(data);
        if(Head==null){
            Head=Tail=null;
            return;
        }
        Tail.next=newnode;
       Tail=newnode;
      }
      public  static void main(String args[]){
        Addlast LL=new Addlast();
        LL.addend(2);
      }
}
