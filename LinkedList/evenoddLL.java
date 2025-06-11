public class evenoddLL {
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
    public Node evenodd(){
        Node even=new Node(-1);
        Node temp=even;
        Node odd=new Node(-1);
        Node temp1=odd;

        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                temp.next=curr;
                temp=temp.next;
            }
            else{
                temp1.next=curr;
                temp1=temp1.next;
            }
            curr=curr.next;
        }
        temp.next=odd.next;
        return even.next;
    }
    public static void main(String[] args) {
        evenoddLL ll=new evenoddLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        head=ll.evenodd();
        ll.print();
    }
}
