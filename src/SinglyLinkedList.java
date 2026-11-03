public class SinglyLinkedList {
    Node head;

    SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void addNode(Node addedNode) {
        if (head == null) {
            head = addedNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = addedNode;
        }
    }


    // traversal linked list
    public static void printSinglyLinked(SinglyLinkedList mylist) {
        Node current = mylist.head;
        if (current == null) {
            System.out.println("empty list");
        } else {
            while (current != null) {
                System.out.println(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public int lowestValue(SinglyLinkedList mylist) {
        Node current = mylist.head;
        if (current == null) {
            System.out.println("empty list");
            return 0;
        } else {
            int lowest = current.data;
            while (current != null) {
                if (current.data < lowest) {
                    lowest = current.data;
                }
                current = current.next;
            }
            return lowest;
        }
    }

    public void deleteValue(int value) {
        if (this.head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = this.head;
        while(current.next != null && current.next.data!=value){
            current = current.next;
        }
        if(current.next == null){
            return;
        }
        current.next =current.next.next;
    }

    public int lenghtList(){
        if(this.head == null){
            return 0;
        }
        else{
            int count=0;
            Node current = this.head;
            while(current!=null){
                count++;
                current = current.next;
            }
            return  count;
        }
    }
    public void insertValue(int value, int position){
        if (this.head == null) {
            if (position == 1) {
                this.head = new Node(value);
            }
            return;
        }
        if(position==1){
            Node current_head = this.head;
            Node newNode = new Node(value);
            newNode.next = current_head;
            this.head = newNode;
            return;
        }
        if(position > this.lenghtList()){
            Node current = this.head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node(value);
            return;
        }
        int count =1;
        Node current = this.head;
        while(count<position-1){
            current = current.next;
            count++;
        }
        Node toInsert = new Node(value);
        toInsert.next =current.next;
        current.next = toInsert;
    }
}
