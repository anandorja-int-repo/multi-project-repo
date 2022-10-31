package com.anandorja.learn;
import java.util.*;
public class StackDemo {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack();

        stack.push(5);
        stack.push(78);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

