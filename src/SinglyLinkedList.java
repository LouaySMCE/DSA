public class SinglyLinkedList {
    Node head;

    SinglyLinkedList(Node head){
        this.head = head;
    }

    public void addNode(Node addedNode) {
        if (head == null) {
            head = addedNode;
        }
        else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = addedNode;
        }
    }

    public static void printSinglyLinked(SinglyLinkedList mylist){
        Node current = mylist.head;
        if(current==null){
            System.out.println("empty list");
        }
        else{
            while(current != null){
                System.out.println(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

}
