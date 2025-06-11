public class DeleteNnodesAfterMnodes {
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

    public void deleteNnodeafterMnode(int m,int n){
        Node curr=head;
        while(curr!=null){
            for(int i=1;i<m && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null || curr.next==null) break;
        Node temp=curr.next;;
        for(int i=1;i<=n && temp!=null;i++){
            temp=temp.next;
        }
        curr.next=temp;
        curr=temp;
        }
    }
    public static void main(String[] args) {
        DeleteNnodesAfterMnodes ll=new DeleteNnodesAfterMnodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addLast(11);
        ll.print();
        ll.deleteNnodeafterMnode(2,2);
        ll.print();
    }
}
