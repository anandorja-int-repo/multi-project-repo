package com.anandorja.learn;

public class ArrayStack {
    static final int MaxSize = 20;
    int arr[] = new int[MaxSize];
    int top;

    ArrayStack() {
        top = -1;
    }

    void push(int value) {
        if (top == MaxSize - 1)
            throw new IndexOutOfBoundsException();
        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException();


        }
        return arr[top--];
    }

    int peek() {
        return arr[top];
    }
}

