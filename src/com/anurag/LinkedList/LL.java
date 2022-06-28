package com.anurag.LinkedList;

public class LL {
    //Create head , tail
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    //for inserting element at first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if tail is equals to null means only one element is present in the linkedlist
        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    //for inserting in last we have to add new node at tail.next
    // tail = node
    // if list is empty i.e tail is null then call insertFirst(val) method
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size +=1;
    }
    //Insert a value at a particular index
    public void insert(int val, int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    // Delete the first node

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //Delete the last node
    //make second last node as tail and then make tail.next = null
    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node indexNodeL = get(index -1);
        int val = indexNodeL.next.value;
        Node indexNodeR = get(index +1);
        indexNodeL.next = indexNodeR;
//        indexNodeL.next = indexNodeL.next.next; // you can write in this way also....
        return val;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node ;
    }


    //we will create a temp variable for printing the value of node which keep on moving until
    //temp.next = null which means that linkedlist is ended now
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    //create a private node class
    private class Node{
        private int value;
        private Node next;

        //create a constructor using the variables.
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
