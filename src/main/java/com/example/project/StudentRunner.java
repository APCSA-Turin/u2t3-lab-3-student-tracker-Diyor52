package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        Student student = new Student("diyor", "fortnite", 2026);
        student.addTestScore(50);
        student.addTestScore(40.0);
        student.addTestScore(9.0);
        student.printStudentInfo();
    }


}