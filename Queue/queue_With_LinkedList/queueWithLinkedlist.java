package Queue.queue_With_LinkedList;

import java.util.Scanner;

class queueWithLinkedList {
        private Node front = null;
        private Node Rare = null;
        static class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void enqueue(Scanner sc){
            System.out.println("Enter DATA");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(front == null){
                front = newNode;
            }
            else{
                Rare.next = newNode;
            }
            Rare = newNode;
        }

        public void dequeue(){
            if(front == null){
                System.out.println("Queue is empty");
            }
            else{
                front = front.next;
            }
        }

        public void Display(){
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" | ");
                temp =temp.next;
            }
            System.out.println("END");
        }
    }

