package com.anandorja.learn;

import junit.framework.TestCase;

import java.util.Optional;

public class StackTest extends TestCase {
    Stack numbers = new Stack();

    public void testTestToString() {
        for(Integer i = 2; i <= 10; i = i+2){
            numbers.push(i);
        }
        assertEquals("[2, 4, 6, 8, 10]",""+numbers);
    }

    public void testPush() {
        for(Integer i = 2; i <= 10; i = i+2){
            numbers.push(i);
        }
        numbers.push(1);
        assertEquals(1, (int)numbers.peek());
    }

    public void testPeek() {
        for(Integer i = 2; i <= 10; i = i+2){
            numbers.push(i);
        }
        assertEquals(10, (int)numbers.peek());
    }

    public void testPop() {
        for(Integer i = 2; i <= 10; i = i+2){
            numbers.push(i);
        }
        numbers.pop();
        assertEquals(8, (int)numbers.peek());
    }
}