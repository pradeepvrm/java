package com.pradeep.linkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if ( head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null ) {
            System.out.print(temp.val + "<=>");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

//        print in reverse
        while (last != null) {
            System.out.print(last.val + "<=>");
            last = last.prev;
        }
        System.out.println("END");
    }

    public void insertlast(int val) {
        Node node = new Node(val);
        node.next = null;

        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
        } else {
            insertFirst(val);
        }

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node temp = find(after);

        if (temp == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}
