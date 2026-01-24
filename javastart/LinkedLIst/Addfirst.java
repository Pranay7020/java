package LinkedLIst;
public class Addfirst{
public static class Node{
    int data;
    Node next;
    public Node(int data){
 this.data=data;
 this.next=null;
    }}

    public static Node Head;
    public static Node tail;
public void add(int data){
    //# create new node
    Node newNode=new Node(data);
    if(Head==null){
        Head=tail=newNode;
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





