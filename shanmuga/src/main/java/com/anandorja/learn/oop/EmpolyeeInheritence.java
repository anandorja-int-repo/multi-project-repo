package com.anandorja.learn.oop;

public class EmpolyeeInheritence {
    String name;
    int id;
    int salary;
    EmpolyeeInheritence(String n , int i,int s){
        name = n;
        id = i;
        salary = s;
    }
    String getName(){
        return name;
    }
    void setName(String n) {
        name = n;
    }
    int getId(){
        return id;
    }
    void setId(int i){
         id = i;
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int s){
        salary = s;
    }
    void bonusSalary(int percentage){
        salary += salary*percentage/100;
    }
    class manager extends EmpolyeeInheritence {
        int bonus;
        manager(String n, int i, int s,int b) {
            super(n, i, s);
            bonus = b;
        }
        int getSalary(){
            return super.getSalary()+bonus; //overriding
        }
        int getBonus(){
            return bonus;
        }
        void setBonus(int b){
            bonus = b;
        }
    }
}
