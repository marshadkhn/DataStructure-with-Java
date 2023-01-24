package Queue.queue_With_LinkedList;

import java.util.Scanner;

public class Mainfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit;
        queueWithLinkedList queue = new queueWithLinkedList();
       do{
           System.out.println("Press 1 to Enqueue");
           System.out.println("Press 2 to Dequeue");
           System.out.println("Press 3 to Display");
           int input = sc.nextInt();
           switch (input)
           {
               case 1 -> queue.enqueue(sc);
               case 2 -> queue.dequeue();
               case 3 -> queue.Display();
           }
           System.out.println("Press 0 to go back on menu");
           System.out.println("Press any key to exit");
           exit=sc.nextInt();
       }
       while(exit==0);{
            System.out.println("EXITED");
        }
    }
}
