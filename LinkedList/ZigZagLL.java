public class ZigZagLL {
    public class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addLast(int data){ //O(1)
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){ //O(n)
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    private Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
 
    }

    public void zigZag(Node head){
        Node mid=findMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node prev=null;
        Node curr=rightHead;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node LH=head;
        Node RH=prev;
        Node nextL,nextR;
        while(LH!=null && RH!=null){
            nextL=LH.next;
            LH.next=RH;
            nextR=RH.next;
            RH.next=nextL;


            LH=nextL;
            RH=nextR;
        }
        
    }
    public static void main(String[] args) {
        ZigZagLL ll=new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print( );
        ll.zigZag(head);
        ll.print();
    }
}
