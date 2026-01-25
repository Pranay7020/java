package LinkedLIst;

public class removeLast {
    

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
     public void removelast(){
        Node temp=Head;
        if(Head==null){
            System.out.print("empty");
            return;
        }
         if(Head==Tail){
            Head=Tail=null;
            return;

        }
        while(temp.next!=Tail){
            temp=temp.next;

        }
        temp.next=null;
        temp=Tail;

     }
     public static void main(String args[]){
       removeLast LL= new removeLast();
        LL.add(3);
        LL.add(2);
        LL.add(1);
        LL.last(4);
        LL.last(5);
        LL.last(6);
        LL.addInInde(3,14);
        LL.removelast();
        LL.print();
     }
}

