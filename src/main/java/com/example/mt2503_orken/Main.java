package com.example.mt2503_orken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Human human = new Human("Robert", 24, true);
        Employee employee = new Employee("Mirlan", 24, true, "AITU", 12345678);
        Student student = new Student("Asfan", 19, true, "MT", 4);

        System.out.println("Student name:");
        String studentName = scanner.nextLine();
        System.out.println("Student AP:");
        String studentap = scanner.nextLine();
        System.out.println("Student age:");
        int studentage = scanner.nextInt();
        System.out.println("Student grade:");
        float studentgrade = scanner.nextFloat();

        student.setGrade(5);
        System.out.println(student.getGrade());

        System.out.println(human.sayYourName());
        System.out.println(human.sayYourName());

        System.out.println(employee.sayYourName());
        System.out.println(human.sayYourName());

        System.out.println(student.sayYourName());
        System.out.println(human.sayYourName());

        System.out.println(Student.amount);

        scanner.close();
    }
}