public class SwappingList {
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

    public void swap(int x,int y){
        Node prevX=null;
        Node currX=head;
        while(currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null;
        Node currY=currX.next;
        while(currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }

        prevX.next=currY;
        prevY.next=currX;

        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public static void main(String[] args) {
        SwappingList ll=new SwappingList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.swap(3,5);
        ll.print();
    }
}
