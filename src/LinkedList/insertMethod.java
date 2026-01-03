package LinkedList;

class SLL1{
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
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertIndex(int idx, int val){
        if(idx==0){
            insertHead(val);
            return;
        }
        if(idx==size){
            insertTail(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<=idx-1; i++){
            x=x.next;
        }
        //insertion
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index!");
//            return -1;
            throw new Error("Invalid Exception");
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp=temp.next;
        }
        return temp.val;
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
        System.out.print("Size: "+size);
    }
}
public class insertMethod {

    public static void main(String[] args) {
        SLL1 list = new SLL1();
        list.insertHead(10);
        list.insertTail(20);
        list.insertTail(30);
        list.display();
        list.insertIndex(1,5);
        list.display();
        list.insertIndex(0,50);
        list.display();
        list.insertIndex(5,90);
        list.display();
        list.insertIndex(10,55);
        list.display();
        System.out.println(list.getElement(4));
        System.out.println(list.getElement(10));


    }
}
