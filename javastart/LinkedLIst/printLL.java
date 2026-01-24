package LinkedLIst;

public class printLL {
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
            Head=Tail=newnode;
            return;
        }
        Tail.next=newnode;
       Tail=newnode;
      }
      public void add(int data){
    //# create new node
    Node newnode=new Node(data);
    if(Head==null){
        Head=Tail=newnode;
  return;
    }
    newnode.next=Head;
    Head=newnode;
}
public void print(){
        Node temp=Head;
        if(Head==null){
            System.out.println("your string is empty");
            return ;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
            
        }System.out.print("null");
        
}
      public  static void main(String args[]){
        printLL LL=new printLL();
         LL.add(3);
        LL.add(2);
        LL.add(1);
        LL.addend(4);
        LL.addend(5);
        LL.addend(6);
        LL.print();
       

      }
}