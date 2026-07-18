package Lec13;

public class Main {

    public static class LinkedList {

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFirst(int val) {
            Node node = new Node(val);

            if (size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }

            size++;
        }

        public void addLast(int val) {
            Node node = new Node(val);

            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node curr = head;

                // Reach node at index idx - 1
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }

                Node node = new Node(val);
                node.next = curr.next;
                curr.next = node;

                size++;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            return head.data;
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            return tail.data;
        }

        public int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return -1;
            }

            Node curr = head;

            for (int i = 0; i < idx; i++) {
                curr = curr.next;
            }

            return curr.data;
        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            int removedValue = head.data;

            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
            }

            size--;
            return removedValue;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            int removedValue = tail.data;

            if (size == 1) {
                head = tail = null;
            } else {
                Node curr = head;

                // Reach second-last node
                for (int i = 0; i < size - 2; i++) {
                    curr = curr.next;
                }

                curr.next = null;
                tail = curr;
            }

            size--;
            return removedValue;
        }

        public int removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return -1;
            }

            if (idx == 0) {
                return removeFirst();
            }

            if (idx == size - 1) {
                return removeLast();
            }

            Node curr = head;

            // Reach node at index idx - 1
            for (int i = 0; i < idx - 1; i++) {
                curr = curr.next;
            }

            int removedValue = curr.next.data;
            curr.next = curr.next.next;

            size--;
            return removedValue;
        }

        public void display() {
            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(30);
        list.addAt(1, 20);
        list.addFirst(5);
        list.addLast(40);

        System.out.println("Original list:");
        list.display();

        System.out.println("Size: " + list.size());
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Value at index 2: " + list.getAt(2));

        System.out.println("Removed first: " + list.removeFirst());
        list.display();

        System.out.println("Removed last: " + list.removeLast());
        list.display();

        System.out.println("Removed at index 1: " + list.removeAt(1));
        list.display();

        System.out.println("Final size: " + list.size());
    }
}