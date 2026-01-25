package LinkedLIst;


public class FindNthNodeDelete {
    public class Node{
        int data;
        Node next;
        public void Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node Head;
    
    public static Node Tail;

public void add(int data){
    //# create new node
    Node newNode= new Node();
    if(Head==null){
        Head=Tail=newNode;
  return;
    }
    newNode.next=Head;
    Head=newNode;
}















    public static void main(String args[]){
    Addfirst LL=new Addfirst();
LL.add(1);
LL.add(2);
 }
}
