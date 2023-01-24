package LinkedList;

public class Circular{
    private Node head;
    private Node tail;

    public Circular(){
        this.head = null;
        this.tail = null;
    }

    //Inserting
        public void insert(int val) {
            Node node = new Node(val);
            if(head == null){
                head = node;
                tail = node;
                return;
            }
            tail.next = node;
            node.next = head;
            tail = node;
        }
        
    //Deleting
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                return;
            }
            node = node.next;
        } while (node != head);
    }
    //Displaying
        public void display() {
            Node node = head;
            if (head != null) {
                do {
                    System.out.print(node.val+" -> ");
                    node = node.next;
                } while (node != head);
            }
            System.out.println("HEAD");
        }
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;    
    }
}
}