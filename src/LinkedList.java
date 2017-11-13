/**
 * Created by akhil on 29/05/17.
 */
public class LinkedList {
Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data= data;
            next= null;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
list.head = new Node(1);
Node second = new Node( 2);
Node third  = new Node(3);


list.head.next = second;
second.next = third;

    }
}
