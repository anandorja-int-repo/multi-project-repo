package com.anandorja.learn;

import java.util.ArrayList;
import java.util.List;


public class StackUsingArrayList implements IStack {
    List<Integer> stackList;

    StackUsingArrayList() {
        stackList = new ArrayList<>();
    }

    boolean isEmpty() {
        if (stackList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        StackUsingArrayList myStack = new StackUsingArrayList();
        myStack.push(5);
        myStack.push(4);
        myStack.push(12);
        myStack.push(29);


        System.out.println("----------Stack ArrayList Implementation-----------------");

        System.out.println(myStack.isEmpty()); // boolean false


        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

    }


    @Override
    public void push(int value) {

        stackList.add(value);
    }

    @Override
    public int pop() {
        return stackList.remove(stackList.size() - 1);
    }

    @Override
    public int peek() {
        return stackList.get(stackList.size() - 1);
    }


}
