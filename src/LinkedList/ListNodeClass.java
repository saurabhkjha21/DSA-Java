package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
        this.next=null;
    }
}
public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;

//        System.out.println(a.val);
//        System.out.println(a.next.val);
        Node current = a;
        while(current!=null){
            System.out.print(current.val+" -> ");
            current = current.next;
        }
        System.out.println("null");

    }

}

