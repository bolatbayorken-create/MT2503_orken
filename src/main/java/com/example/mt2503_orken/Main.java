package com.example.mt2503_orken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student student = new Student("Asfan",19,true,"MT",4);

        Human humanSuper = new Employee("Mirlan",24,true,"AITU",12345678);

        IWork workSuper = new Employee("Beka",20,true,"Halyk", 12034);
        IStudy studySuper = new Employee("Shkiper",5,true,"unemployed",0);


        System.out.println("Student name:");
        String studentName = scanner.nextLine();
        System.out.println("Student Academic Program:");
        String studentap = scanner.nextLine();
        System.out.println("Student age:");
        int studentage = scanner.nextInt();
        System.out.println("Student grade:");
        float studentgrade = scanner.nextFloat();

        student.setGrade(5);
        System.out.println(student.getGrade());

        System.out.println(student.sayYourName());
        System.out.println(humanSuper.sayYourName());

        System.out.println(Student.amount);

        // ---------------------------------
        student.study();
        System.out.println(student.getAcademicInfo());

        workSuper.work();
        System.out.println(workSuper.getSalary());

        scanner.close();
    }
}