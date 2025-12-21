package com.example.mt2503_orken;

public class Student extends Human{
    private String ap;
    private float grade;

    public static int amount = 0; // я честно не понял в чем суть static

    public Student(String name, int age, boolean isexist, String ap, float grade){
        super(name, age, isexist);
        this.ap = ap;
        this.grade = grade;
    }

    public String getAp(){return ap;}
    public void setAp(String ap){this.ap = ap;}

    public float getGrade(){return grade;}
    public void setGrade(float grade){this.grade = grade;}

    @Override
    public String sayYourPosition(){return "I am a Student";}
    public String sayYourName(){return getName();}
}
