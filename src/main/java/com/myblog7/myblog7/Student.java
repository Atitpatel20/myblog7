package com.myblog7.myblog7;

public class Student {
    private String studentName;
    private int marks;
    private String grade;

    public Student(String studentName, int marks, String grade) {
        this.studentName = studentName;
        this.marks = marks;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }
}
