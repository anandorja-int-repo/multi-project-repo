package com.anandorja.learn.methods;

public class StringBufferExp {
    public static void main(String[]args){
        StringBuffer sample = new StringBuffer(" ");
        sample.append("name");
        sample.replace(0,2,"ha");
        System.out.println(sample);
    }
}
