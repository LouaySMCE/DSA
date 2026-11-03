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
}
