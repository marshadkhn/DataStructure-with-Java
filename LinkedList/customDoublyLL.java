package LinkedList;

public class customDoublyLL
{
    Node head;

    //Insertion
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    //Displaying
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val+" <--> ");
            node = node.next;
        }
        System.out.println("END");
    }
    //Reversal
    public void reverse()
    {
        Node node = head;
        Node last = null;
        while (last != null){
            System.out.print(last.val+" <--> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node
    {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
