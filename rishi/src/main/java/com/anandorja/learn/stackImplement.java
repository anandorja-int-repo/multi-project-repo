package com.anandorja.learn;
import java.util.ArrayList;

class stackImplement implements stackInterface {
    private ArrayList<Integer> elements = new ArrayList<>();
    public String toString() {
		return ""+elements;
	}
    public void push(Integer value){
        elements.add(value);
    }
    public Integer peek() {
		if (elements.isEmpty()) {
			return null;
		}
		return elements.get(elements.size() - 1);
	}
    public Integer pop() {
		if (elements.isEmpty()) {
			return null;
		}
		int top = elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return top;
	}

    public static void main(String[] args) {
        
        stackImplement numbers = new stackImplement();
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