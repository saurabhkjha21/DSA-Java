package LinkedList;


class SLL{
    Node head;
    Node tail;
    int size;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void size(){
        System.out.println("Length of LL : "+size);
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.display();
        list.size();
        list.insertAtHead(5);
        list.display();
        list.size();


    }
}
