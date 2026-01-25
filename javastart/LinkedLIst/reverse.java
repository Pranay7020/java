package LinkedLIst;
public class reverse {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node Head;
    public static node Tail;

    public void addd(int data){
        node newnode=new node(data);
        if(Head==null){
            Head=Tail=newnode;
            return;
        }
        
        newnode.next=Head;
       Head = newnode;
    }
     public void rev(){
        node prev =null;
        node curr =Tail=Head;
        node next ;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
        prev=curr;
        curr=next;

        }
        Head=prev;
       

       
        
    
     }
     public void print(){
        node temp=Head;
        if(Head==null){
            System.out.println("your string is empty");
            return ;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
            
        }System.out.print("null");
        
}
public static void main(String args[]){
    reverse  LL=new reverse ();
    LL.addd(5);
    LL.addd(4);
    LL.addd(3);
LL.addd(2);
LL.addd(1);
LL.rev();
LL.print();
 }
}
