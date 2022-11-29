package com.anandorja.learn.headfirstjava;

public class AbsractDemo {
    abstract class Shape {

        private String shape;

        public Shape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public abstract void areaOf();
    }

    class Triangle extends Shape {

        public Triangle(String shape) {
            super(shape);
            //TODO Auto-generated constructor stub
        }

        @Override
        public void areaOf() {

        }

        public int areaOf(int b,int h) {

            int areaOfTriangle = 1 / 2 * b * h;
           return areaOfTriangle;
        }
    }

    class Square extends Shape {

        public Square(String shape) {
            super(shape);
        }

        public int areaOf(int s) {
            int areaOfSquare = s*s;
            return areaOfSquare;
        }

        @Override
        public void areaOf() {

        }
    }
}
