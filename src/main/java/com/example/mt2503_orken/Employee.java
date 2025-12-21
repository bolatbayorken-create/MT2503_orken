package com.example.mt2503_orken;

public class Employee extends Human{
    private String company;
    private float salary;

    public Employee(String name, int age, boolean isexist, String company, float salary){
        super(name,age,isexist);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany(){return company;}
    public void setCompany(String company){this.company = company;}

    public float getSalary(){return salary;}
    public void setSalary(float salary){this.salary = salary;}

    @Override
    public String sayYourPosition(){return "I am an Employee";}
    public String sayYourName(){return getName();}
}
