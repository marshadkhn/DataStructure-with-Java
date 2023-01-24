package LinkedList;

public class customSinglyLL {

    //All variables
    private Node head;
    private Node tail;
    private int size;
    public customSinglyLL(){this.size = 0;}           //Size at initial state

    //Insertion all operation
    public void insertFirst(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null) tail = head;
        size += 1;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertMiddle(int val, int index)
    {
       if(index == 0)
       {
           insertFirst(val);
           return;
       }
       if(index == size)
       {
           insertLast(val);
           return;
       }
       Node tempHead = head;
        for (int i = 1; i < index; i++)
        {
            tempHead = tempHead.next;
        }
        Node node = new Node(val, tempHead.next);
        tempHead.next = node;
        size++;
    }

    //Deletion
    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteMiddle(int index)
    {
        if(size == 0) return deleteFirst();
        if(index == size - 1) return deleteLast();

        Node prev = getIndex(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }
    public int deleteLast()
    {
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }


    //Taking index
    public Node getIndex(int index)
    {
        Node node = head;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        return node;
    }
    public void display()
    {
        Node tempHead = head;
        while(tempHead != null)
        {
            System.out.print(tempHead.value + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println("END");
    }
    //Structure
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }
}
