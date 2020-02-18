package com.homework;

import com.homework.model.Coffee;
import com.homework.model.Glasses;
import com.homework.model.Student;
import com.homework.service.CoffeeService;
import com.homework.service.GlassesService;
import com.homework.service.StudentsService;
import com.homework.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        StudentsService studentsService = new StudentsService();
        GlassesService glassesService = new GlassesService();
        CoffeeService coffeeService = new CoffeeService();

        /*testing for student objects*/
        TreeSet<Student> setOfStudents = new TreeSet<>();
        setOfStudents.add(studentsService.student1);
        setOfStudents.add(studentsService.student2);
        setOfStudents.add(studentsService.student3);
        setOfStudents.add(studentsService.student4);
        setOfStudents.add(studentsService.student5);
        setOfStudents.add(studentsService.student6);
        setOfStudents.add(studentsService.student7);
        setOfStudents.add(studentsService.student8);

        setOfStudents.printElements();  //prints the elements
        System.out.println("Size is " + setOfStudents.getSize(setOfStudents));  //size of the set
        System.out.println(setOfStudents.contains(studentsService.student1));  //containing the element
        setOfStudents.remove(studentsService.student6);  //removes an element from the set
        System.out.println("removed a student");
        setOfStudents.printElements();  //prints elements after removing
        System.out.println("Size is " + setOfStudents.getSize(setOfStudents));  //size after removing
        System.out.println("--------------------------------");


        /*testing for glasses objects*/
        TreeSet<Glasses> setOfGlasses = new TreeSet<>();
        setOfGlasses.add(glassesService.glasses1);
        setOfGlasses.add(glassesService.glasses2);
        setOfGlasses.add(glassesService.glasses3);
        setOfGlasses.add(glassesService.glasses4);
        setOfGlasses.add(glassesService.glasses5);

        setOfGlasses.printElements();  //prints elements
        System.out.println("Size is " + setOfGlasses.getSize(setOfGlasses));  //size of the set
        System.out.println(setOfGlasses.contains(glassesService.glasses1));  //containing the element
        setOfGlasses.remove(glassesService.glasses1);  //removes this element
        System.out.println("removed a glasses object");
        setOfGlasses.printElements();  //prints elements after removing
        System.out.println("Size is " + setOfGlasses.getSize(setOfGlasses));  //size after removing
        System.out.println("--------------------------------");


        /*testing for coffee objects*/
        TreeSet<Coffee> setOfCoffee = new TreeSet<>();
        setOfCoffee.add(coffeeService.coffee1);
        setOfCoffee.add(coffeeService.coffee2);
        setOfCoffee.add(coffeeService.coffee3);
        setOfCoffee.add(coffeeService.coffee4);
        setOfCoffee.add(coffeeService.coffee5);
        setOfCoffee.add(coffeeService.coffee6);

        setOfCoffee.printElements();  //prints tht elements
        System.out.println("Size is " + setOfCoffee.getSize(setOfCoffee));  //size of the set
        System.out.println(setOfCoffee.contains(coffeeService.coffee1));  //containing the element
        setOfCoffee.remove(coffeeService.coffee1);  //removes this element
        System.out.println("removed a coffee object");
        setOfCoffee.printElements();  //prints after removing
        System.out.println("Size is " + setOfCoffee.getSize(setOfCoffee));  //size after removing
    }
}
