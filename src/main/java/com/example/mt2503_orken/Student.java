package com.example.mt2503_orken;

public final class Student extends Human implements IStudy{
    private String academicProgram;
    private float grade;

    private final String university = "AITU";

    public static int amount = 0;

    public Student(String name, int age, boolean isExist, String academicProgram, float grade){
        super(name, age, isExist);
        this.academicProgram = academicProgram;
        this.grade = grade;
    }

    public String getAcademicProgram(){return academicProgram;}
    public void setAcademicProgram(String academicProgram){this.academicProgram = academicProgram;}

    public float getGrade(){return grade;}
    public void setGrade(float grade){this.grade = grade;}

    @Override
    public String sayYourPosition(){return "I am a Student";}
    public String sayYourName(){return getName();}

    public void study(){System.out.println(getName() + " is studying " + academicProgram);}
    public String getAcademicInfo(){return academicProgram + " grade: " + grade;}

    public final String getUniversity(){return university;}

}
