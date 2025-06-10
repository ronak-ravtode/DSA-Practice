public class MergeSortOnLL {
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


    private Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node Merge(Node left,Node right){
        Node Merge=new Node(-1);
        Node temp=Merge;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                temp=temp.next;
                left=left.next;
            }
            else {
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }
        while(right!=null){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }
        return Merge.next;
    }
    public Node MergeSort(Node head){
        if(head==null || head.next==null) return head;
        Node mid=findMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node leftPart=MergeSort(head);
        Node rightPart=MergeSort(rightHead);
        return Merge(leftPart,rightPart);
    }

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
    public static void main(String[] args) {
        MergeSortOnLL ll=new MergeSortOnLL();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        head=ll.MergeSort(head);
        ll.print( );
    }
}
