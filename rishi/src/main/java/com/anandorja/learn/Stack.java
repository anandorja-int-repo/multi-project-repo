package com.anandorja.learn;
import java.util.ArrayList;
import java.util.EmptyStackException;

class Stack implements IStack {
    //private ArrayList<Integer> elements = new ArrayList<>();
    private ArrList elements = new ArrList();
    @Override
    public String toString() {
		return ""+elements;
	}
    @Override
    public void push(Integer value){
        elements.add(value);
    }
    @Override
    public Object peek() {
		if (elements.isEmpty()) {
			throw new EmptyStackException();
		}
		return elements.get(elements.size() - 1);
	}
    @Override
    public Object pop() {
		if (elements.isEmpty()) {
            throw new EmptyStackException();
		}
		Object top = elements.get(elements.size() - 1);
		elements.delete(elements.size() - 1);
		return top;
	}

    public static void main(String[] args) {
        
        Stack numbers = new Stack();
        for(Integer i = 2; i <= 20; i = i+2){
            numbers.push(i);
        }
        System.out.println(numbers);
        System.out.println(numbers.pop());
        System.out.println(numbers);
        System.out.println(numbers.peek());

        while (! numbers.elements.isEmpty()){
            System.out.println(numbers.pop());
        }
        System.out.println(numbers.pop());
    }
    
}