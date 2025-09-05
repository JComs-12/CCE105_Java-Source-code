package dataStructtures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import dataStructtures.Culanag.Node;

public class Comision_CC105_DataStructure {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int mainChoice;

        while (true) {
        	System.out.println("________________________________");
            System.out.println("\nChoose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.println("________________________________");
            System.out.print("Enter choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    stackOperations(sc);
                    break;
                case 2:
                    queueOperations(sc);
                    break;
                case 3:
                    linkedListOperations(sc);
                    break;
                case 4:
                    circularLinkedListOperations(sc);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    static void stackOperations(Scanner sc) {
        Stack<Integer> stack = new Stack<>();
        int choice;

        System.out.println("\n--- Stack Operations ---");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit Operation");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("________________________________");
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println("________________________________");
                    System.out.println("Pushed " + val + " into stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                    	System.out.println("________________________________");
                        System.out.println("Popped: " + stack.pop());
                    } else {
                    	System.out.println("________________________________");
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                	System.out.println("________________________________");
                	System.out.println("");
                    System.out.print("Stack contents: ");
                    ListIterator<Integer> it = stack.listIterator(stack.size());
                    while (it.hasPrevious()) {
                        System.out.print(it.previous() + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                	System.out.println("________________________________");
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void queueOperations(Scanner sc) {
        Queue<Integer> queue = new LinkedList<>();
        int choice;

        System.out.println("\n--- Queue Operations ---");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit Operation");
            System.out.println("________________________________");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("________________________________");
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.add(val);
                    System.out.println("________________________________");
                    System.out.println("Enqueued " + val + " into queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                    	System.out.println("________________________________");
                        System.out.println("Dequeued: " + queue.remove());
                    } else {
                    	System.out.println("________________________________");
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                	System.out.println("________________________________");
                    System.out.print("Queue contents: ");
                    for (int item : queue) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                	System.out.println("________________________________");
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void linkedListOperations(Scanner sc) {
        LinkedList<Integer> list = new LinkedList<>();
        int choice;

        System.out.println("\n--- Linked List Operations ---");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert at End");
            System.out.println("2. Delete at Beginning");
            System.out.println("3. Display");
            System.out.println("4. Exit Operation");
            System.out.println("________________________________");
            System.out.print("Enter choice: ");
            System.out.println("________________________________");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("________________________________");
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.addLast(val);
                    System.out.println("________________________________");
                    System.out.println("Inserted " + val + " at end.");
                    break;
                case 2:
                    if (!list.isEmpty()) {
                    	System.out.println("________________________________");
                        System.out.println("Deleted from beginning: " + list.removeFirst());
                    } else {
                    	System.out.println("________________________________");
                        System.out.println("List is empty.");
                    }
                    break;
                case 3:
                	System.out.println("________________________________");
                    System.out.print("Linked List contents: ");
                    for (int item : list) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                	System.out.println("________________________________");
                    System.out.println("Invalid choice.");
            }
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static Node head = null;

    static void circularLinkedListOperations(Scanner sc) {
        int choice;

        System.out.println("\n--- Circular Linked List Operations ---");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit Operation");
            System.out.println("________________________________");
            System.out.print("Enter choice: ");
            System.out.println("________________________________");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    System.out.println("________________________________");
                    int val = sc.nextInt();
                    insertCircular(val);
                    System.out.println("Inserted " + val);
                    break;
                case 2:
                    deleteCircular();
                    break;
                case 3:
                    displayCircular();
                    break;
                case 4:
                    head = null; 
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void insertCircular(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    static void deleteCircular() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        System.out.println("Deleted: " + head.data);
        temp.next = head.next;
        head = head.next;
    }

    static void displayCircular() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Circular Linked List contents: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}