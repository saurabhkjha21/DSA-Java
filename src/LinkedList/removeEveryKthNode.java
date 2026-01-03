package LinkedList;


public class removeEveryKthNode {
    static Node deleteK(Node head, int k){
        if(head==null  || k<=0){
            return head;
        }

        Node temp=head;
        Node prev=null;
        int count =0;

        while(temp!=null){
            count++;
            if(count%k==0){
                if(prev!=null){
                    prev.next=temp.next;
                }
                else{
                    head=temp.next;
                }
            }else{
                prev=temp;
            }
            temp=temp.next;
        }
        return head;

    }
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        removeEveryKthNode list = new removeEveryKthNode();
        list.display(head);
        int k=2;
        head = deleteK(head, k);
        list.display(head);

    }

}
