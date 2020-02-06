package com.homework.service;

import com.homework.model.Student;

public class StudentsService {
    public Student student1;
    public Student student2;
    public Student student3;
    public Student student4;
    public Student student5;
    public Student student6;
    public Student student7;
    public Student student8;

    public StudentsService() {
        student1 = new Student("Armen", "Hovhannisyan", 18);
        student2 = new Student("Anna", "Saryan", 22);
        student3 = new Student("Armen", "Hovhannisyan", 18);
        student4 = new Student("Ella", "Sargsyan", 15);
        student5 = new Student("Anna", "Saryan", 22);
        student6 = new Student("Ella", "Sargsyan", 15);
        student7 = new Student("Gayane", "Zakoyan", 19);
        student8 = new Student("Anna", "Saryan", 22);
    }
}
