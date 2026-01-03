package LinkedList;

public class insertHead {
    Node head;
    Node tail;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=null;
        else{
            temp.next=head;
            head=temp;
        }
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head=temp=null;
        else{
            tail.next=temp;
            tail=temp;

        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(20);
        list.display();
        list.insertAtHead(10);
        list.display();
        list.insertAtTail(30);
        list.display();

    }
}
