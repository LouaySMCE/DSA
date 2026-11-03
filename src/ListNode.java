public class ListNode {
    int val;
    ListNode next;

    ListNode(){
    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode lastNode(ListNode head){
        ListNode current = head;
        while(current!=null){
            current = current.next;
        }
        return current;
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode prochain = current.next;
            current.next = previous;
            previous = current;
            current = prochain;
        }
        return previous;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                current.next = list1;;
                list1 = list1.next;
                current = current.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        if(list2==null){
            current.next = list1;
        }
        else {
            current.next = list2;
        }
        return dummy.next;
    }
}
