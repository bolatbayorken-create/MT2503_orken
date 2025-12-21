package com.example.mt2503_orken;

public class Human {
    private int age;
    private String name;
    private boolean isexist;

    public Human(String name, int age, boolean isexist){
        this.name = name;
        this.age = age;
        this.isexist = isexist;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public boolean getIsexist(){return isexist;}
    public void setIsexist(boolean isexist){this.isexist = isexist;}


    public String sayYourPosition(){return "I am a Human";}
    public String sayYourName(){return name;}
}
