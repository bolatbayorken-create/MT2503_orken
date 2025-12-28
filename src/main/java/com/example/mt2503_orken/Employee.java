package com.example.mt2503_orken;

public class Employee extends Human implements IWork, IStudy{
    private String company;
    private float salary;

    public Employee(String name, int age, boolean isExist, String company, float salary){
        super(name,age,isExist);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany(){return company;}
    public void setCompany(String company){this.company = company;}

    public void setSalary(float salary){this.salary = salary;}

    @Override
    public String sayYourPosition(){return "I am an Employee";}
    public String sayYourName(){return getName();}

    public void work(){System.out.println(getName() + " is working at " + company);}
    public float getSalary(){return salary;}

    public void study(){System.out.println(name + "is studying while working");}
    public String getAcademicInfo(){return "Employee academic information";}
}
