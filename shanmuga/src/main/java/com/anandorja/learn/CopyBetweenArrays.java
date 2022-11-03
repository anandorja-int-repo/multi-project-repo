package com.anandorja.learn;

public class CopyBetweenArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = a.clone();
        //b[0]++;
        System.out.println("a arrays are ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println("b arrays are");
        for (int j = 0; j < b.length; j++)
            System.out.println(b[j]);
    }
}

