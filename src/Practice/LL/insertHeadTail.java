package Practice.LL;


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
    void insertHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void size(){
        System.out.println(size);
    }

}
public class insertHeadTail {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertHead(10);
        list.display();
        list.size();
        list.insertHead(20);
        list.insertHead(30);
        list.insertHead(40);
        list.display();
        list.insertTail(5);
        list.display();
        list.size();

    }
}
