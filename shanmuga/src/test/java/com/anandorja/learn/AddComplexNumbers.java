package com.anandorja.learn;

public class AddComplexNumbers {
    int real;
    int img;

    public AddComplexNumbers(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public void imaginary() {
        System.out.print(this.real + "i" + this.img);
    }

    public void addComplexNumbers(int a, int b) {
        AddComplexNumbers result = new AddComplexNumbers(0, 0);
//        result.real = a.real + b.real;
//        result.img= a.img + b.img;
//    }
    }
}
