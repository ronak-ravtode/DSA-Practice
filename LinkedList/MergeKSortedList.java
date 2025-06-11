public class MergeKSortedList {
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

    public void print(Node head){ //O(n)
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public Node createNewNode(int arr[]){
        Node dummy=new Node(-1);
        Node temp=dummy;
        for(int num:arr){
            temp.next=new Node(num);
            temp=temp.next;
        }
        return dummy.next;
    }

    public Node mergeLL(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.data<=l2.data){
            l1.next=mergeLL(l1.next, l2);
            return l1;
        }
        else{
            l2.next=mergeLL(l1, l2.next);
            return l2;
        }
    }

    public Node partition(int start,int end,Node list[]){
        if(start==end){
            return list[start];
        }
        int mid=start+(end-start)/2;
        Node l1=partition(start, mid, list);
        Node l2=partition(mid+1, end, list);
        return mergeLL(l1,l2);
    }
    public static void main(String[] args) {
        MergeKSortedList ll=new MergeKSortedList();
        Node list[]=new Node[4];
        list[0]=ll.createNewNode(new int[]{1,3,6});
        list[1]=ll.createNewNode(new int[]{2,7,9});
        list[2]=ll.createNewNode(new int[]{15,16,30});
        list[3]=ll.createNewNode(new int[]{3,4,8});
        Node result=ll.partition(0,list.length-1,list);
        ll.print(result);
    }
}
