package com.anandorja.learn.string;

public class Character {

    private String str;
    Character(String str){
        this.str = str;
    }

    public char getChar(int index) {

        return str.charAt(index);
    }
}
