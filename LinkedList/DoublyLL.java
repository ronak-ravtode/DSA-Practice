public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(){

        }
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return value;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return value;
    }

    public void reverseDLL(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print(){ 
        Node temp=head;
        System.out.print("null<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.reverseDLL();
        ll.print();
    }
}
