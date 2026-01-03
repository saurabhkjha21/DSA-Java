package Practice;


class SLL {
    Node head;
    Node tail;
    int size;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    void insertHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertIdx(int idx, int val) {
        if (idx == 0) {
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
        Node curr = head;
        for(int i=1; i<idx; i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        size++;
    }

    int getElement(int idx) throws Error{
//        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid Exception");
        }
        Node temp=head;
        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        return temp.val;
    }

    void setIdx(int idx, int val){
//        if(idx==size-1){
//            tail.val=val;
//
//        }
        if(idx>=size || idx<0){
            throw new Error("Error hai");
        }
        Node temp=head;
        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        temp.val=val;


    }
    void deleteHead() throws Error{
        if(head==null) throw new Error("Empty List");
        head=head.next;
//        if(head==null) tail=null;
        size--;
    }

    void deleteTail() throws Error{
        if(head==null) throw new Error("Empty List");
        if(head==tail) head=tail=null;
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        size--;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void Size(){
        System.out.println(size);
    }
}


public class LL1 {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.display();
        list.insertHead(10);
        list.insertHead(20);
        list.insertTail(30);
        list.display();
        list.insertIdx(1,55);
        list.display();
        System.out.println(list.getElement(3));
        list.setIdx(2,90);
        list.display();
        list.deleteHead();
        list.display();
        list.Size();
        list.deleteTail();
        list.display();
        list.Size();
        System.out.println(list.tail.val);

    }
}
