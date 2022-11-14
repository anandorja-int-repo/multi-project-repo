package com.anandorja.learn.oop;

public class ClassAndObject {
    public class Student{
        String name;
        int id;
        int std;
        String sec;
        public Student(String name, int id, int std, String sec){
            this.name = name;
            this.id = id;
            this.std = std;
            this.sec = sec;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getSec() {
            return sec;
        }

        public int getStd() {
            return std;
        }
        public String details(){
            return (this.name+"," + this.id+"," + this.sec+"," + this.std+",");
        }
    }
}

