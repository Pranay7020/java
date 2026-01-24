package LinkedLIst;

public class AddNewnodeIndex {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
     public static Node Tail;
     public static Node size;
     public  void add(int data){
        Node newnode=new Node(data);
        if(Head==null){
            Head=Tail=newnode;
            return ;

 
        }
        newnode.next=Head;
        Head=newnode;

     }
     public  void last(int data){
         Node newnode=new Node(data);
          if(Head==null){
            Head=Tail=newnode;
            return ;
        }
        Tail.next=newnode;
        Tail=newnode;
     }
     public  void addInInde(int index,int data){
      Node newnode=new Node(data);
       if(Head==null){
            Head=Tail=newnode;
            return ;
        }
        Node temp=Head;
          int  i=0;
          while(i<index-1){
            temp=temp.next;
            i++;
          }
          newnode.next=temp.next;
          temp.next=newnode;


     }
     public void print(){
         Node temp=Head;
         if(Head==null){
            System.out.printf("empty");
            return;
         }
         while(temp !=null){
          System.out.printf(temp.data+"-->");
           temp=temp.next;
         }
         System.out.printf("null");

     }
     public static void main(String args[]){
        AddNewnodeIndex LL=new AddNewnodeIndex();
        LL.add(3);
        LL.add(2);
        LL.add(1);
        LL.last(4);
        LL.last(5);
        LL.last(6);
        LL.addInInde(3,14);
        LL.print();



     }
}
