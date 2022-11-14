package com.anandorja.learn.oop;

abstract class MemberAbstractExp {
        private String name;
        abstract void welcomeMessage();
    }
    class Staffs extends MemberAbstractExp{

        @Override
        void welcomeMessage() {
            //System.out.println("Hi Welcome to Staff");
        }
    }
    class Students extends MemberAbstractExp{
        @Override
        void welcomeMessage(){
            //System.out.println("Hi Welcome to Student");
        }
    }
