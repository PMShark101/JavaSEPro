package com.pmshark.javabean;

public class StudentOperator {
    private Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (student.getScore() >= 60) {
            System.out.println(student.getName() + " pass");
        } else {
            System.out.println(student.getName() + " fail");
        }
    }

}
