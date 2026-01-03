package LinkedList;

public class DeleteMiddleNode {
    Node head;
//    Node tail;
//    int size;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static int getMiddle(Node head){
        Node slow = head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
    static Node deleteMiddle(Node head){
        if(head==null || head.next==null) return null;
        Node slow = head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
        DeleteMiddleNode list = new DeleteMiddleNode();
        list.display(head);
        head = deleteMiddle(head);
        list.display(head);
    }
}
