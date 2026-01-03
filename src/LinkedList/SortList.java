package LinkedList;

public class SortList {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    public Node[] splitHalves(Node h){
        if(h==null || h.next==null) return new Node[]{h,null};
        Node slow=h, fast=h, prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return new Node[]{h,slow};
    }
    public Node mergeList(Node a, Node b){
            Node dummy = new Node(0);
            Node temp=dummy;
            while(a!=null && b!=null){
                if(a.val<=b.val){
                    temp.next=a;
                    a=a.next;
                }else{
                    temp.next=b;
                    b=b.next;
                }
                temp=temp.next;
            }
            if(a!=null) temp.next=a;
            if(b!=null) temp.next=b;
            return dummy.next;
    }
    public Node MergeSort(Node h){
        if(h==null || h.next==null) return h;
        Node[] parts = splitHalves(h);
        Node left = MergeSort(parts[0]);
        Node right = MergeSort(parts[1]);

        Node dummy = new Node(0);
        Node temp = dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left==null) temp.next=right;
        if(right==null) temp.next=left;

        return dummy.next;
    }


    void display(){
        display(this.head);
    }
    void display(Node node){
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortList list=new SortList();
        list.insertAtHead(10);
        list.insertAtHead(30);
        list.insertAtHead(120);
        list.insertAtHead(110);
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(5);
        list.display();
        Node[] parts = list.splitHalves(list.head);
        list.display(parts[0]);
        list.display(parts[1]);
        list.display(list.mergeList(parts[0], parts[1]));
        list.display(list.MergeSort(list.head));
    }
}
