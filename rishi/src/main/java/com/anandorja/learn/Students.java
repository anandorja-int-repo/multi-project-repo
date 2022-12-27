package com.anandorja.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Students {
    private List<String> students = new ArrayList<>();
    void addStudent(String name){
        students.add(name);
    }
    List<String> getStudents(){
//        return Collections.unmodifiableList(students);
        return students;
    }
}
