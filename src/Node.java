public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public static void PrintLinkedList(Node mylinkedlist){
        Node current = mylinkedlist;
        while(current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
