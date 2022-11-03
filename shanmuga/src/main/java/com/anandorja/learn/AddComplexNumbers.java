package com.anandorja.learn;

class AddComplexNumber {
    int real, image;

    public void complexNumberAddition(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void showC() {
        System.out.print(this.real + " +i" + this.image);
    }
}
