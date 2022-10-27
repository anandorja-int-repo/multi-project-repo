package com.anandorja.learn;

import java.util.Iterator;

public class LinkedList implements IList{
    class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    private int size = 0;

    @Override
    public void insert(int index, Object value) throws IndexOutOfBoundsException {
        Node newNode = new Node(value);
        if(index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            ++size;
            return;
        }
        if(index < size)
        {
            int position = 0;
            Node current = head;
            while(current != null){
                if(position == index){
                    newNode.next = current.next;
                    current.next = newNode;
                    ++size;
                    return;
                }
                ++position;
            }
        }

    }

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
        }
        tail = newNode;
        ++size;
    }

    @Override
    public Object delete(int index) throws IndexOutOfBoundsException {
        int position = 0;
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        Node previous = head;
        Object del = null;
        while (current != null){
            if(index == 0){
                del = current.data;
                head = current.next;
                --size;
                break;
            }
            else if (index == position) {
                del = current.data;
                previous.next = current.next;
                --size;
                break;
            }
            if (position != 0) {
                previous = previous.next;
            }
            current = current.next;
            ++position;
        }
        return del;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object set(int index, Object value) throws IndexOutOfBoundsException {
        int position = 0;
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        while (current != null){
            if(position == index){
                current.data = value;
                break;
            }
            current = current.next;
            ++position;
        }
        return value;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        int position = 0;
        Object value = null;
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        while (current != null){
            value = current.data;
            current = current.next;
            if(position == index){
                break;
            }
            ++position;
        }
        return value;
    }

    @Override
    public int indexOf(Object value) {
        int position = 0;
        int index = -1;
        Node current = head;
        while (current != null){
            if(current.data == value){
                index = position;
                break;
            }
            current = current.next;
            ++position;
        }
        return index;
    }

    @Override
    public boolean contains(Object value) {
        Node current = head;
        while (current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Iterator iterator() {
        return new LinkedIterator(head);
    }
}
