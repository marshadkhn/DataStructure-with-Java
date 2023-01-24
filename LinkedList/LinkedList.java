package LinkedList;

public class LinkedList {
    public static void main(String[] args)
    {
        //Importing all the classes
        customSinglyLL LL = new customSinglyLL();
        customDoublyLL DLL = new customDoublyLL();
        Circular CL = new Circular();

        //Operations
        System.out.println("Singly Linked list!");
        LL.insertFirst(3);
        LL.insertFirst(5);
        LL.insertFirst(6);
        LL.insertFirst(8);         
        LL.insertFirst(7);
        LL.insertLast(10);
        LL.insertLast(17);
        LL.insertMiddle(4,4);
        LL.deleteFirst();
        LL.deleteLast();                
        LL.deleteMiddle(3);
        LL.display();        

        System.out.println("Doubly Linked List");
        DLL.insertFirst(2);
        DLL.insertFirst(3);
        DLL.insertFirst(4);
        DLL.insertFirst(1);
        DLL.insertFirst(6);
        DLL.display();

        System.out.println("Circular Linkedlist");
        CL.insert(2);
        CL.insert(3);
        CL.insert(4);
        CL.display();
        CL.delete(3);
        CL.display();
    }
}
