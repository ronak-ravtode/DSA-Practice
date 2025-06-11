public class FindIntersection {
    public static class Node{
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

    // public static Node findIntersection(Node head1,Node head2){
    //     Node currA=head1;
    //     while(currA!=null){
    //         Node currB=head2;
    //         while(currB!=null){
    //             if(currA==currB) return currA;
    //             currB=currB.next;
    //         }
    //         currA=currA.next;
    //     }
    //     return null;
    // }

    public static Node findIntersection(Node head1,Node head2){
        if(head1==null || head2==null) return null;
        Node a=head1;
        Node b=head2;

        while(a!=b){
            a=(a==null)? head2:a.next;
            b=(b==null)? head1:b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        Node head1= new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(6);
        Node temp=head1.next.next.next;
        head1.next.next.next.next=new Node(7);

        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=temp;

        Node intersection=findIntersection(head1,head2);
        if(intersection==null){
            System.out.println("No intersection point");
        }
        else System.out.println(intersection.data);
    }
}
