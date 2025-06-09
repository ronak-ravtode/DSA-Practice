public class LinkedList {
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

    public void addFirst(int data){ //O(1)
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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

    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node prev=head;
        int i=0;
        while(i!=idx-1){
            prev=prev.next;
            i++;
        }
        newNode.next=prev.next;
        prev.next=newNode;
    }

    public int removeFirst(){ //O(1)
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        else if (size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }

    public int removeLast(){ //O(n)
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        else if (size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=head.data;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }

    public int search(int value){ //O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==value) return i;
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int searchRec(int i,Node temp,int value){ //O(n)
        if(i==size){
            return -1;
        }
        if(temp.data==value) return i;
        return searchRec(i+1,temp.next, value);
    }

    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public void remove(int idx){
        Node prev=head;
        int i=0;
        while(i!=idx-1){
            prev=prev.next; 
            i++;
        }
        prev.next=prev.next.next;
    }

    public void removeNthnodefromLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        Node prev=head;
        int i=0;
        while(i!=sz-n-1){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }

    private Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalimdrome(){
        if(head==null || head.next==null) return true;
        Node mid=findMid(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(left!=null && right!=null ){
            if(left.data!=right.data) return false;
            left=left.next;
            right=right.next;
        }
        return true;

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
        LinkedList ll =new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.isPalimdrome());
        // ll.print();
    }
}
