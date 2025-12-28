package com.example.mt2503_orken;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isExist;

    public Human(String name, int age, boolean isExist){
        this.name = name;
        this.age = age;
        this.isExist = isExist;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public boolean getIsExist(){return isExist;}
    public void setIsExist(boolean isExist){this.isExist = isExist;}

    public String sayYourName(){return name;}

    public abstract String sayYourPosition();

}
