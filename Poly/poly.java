package Poly;

public class poly {
    public static void main(String[] args) {
        student std = new student();
        idCard id = new idCard();
        department dept = new department();
        System.out.println("Roll No. " + std.rollno());
        System.out.println("Identity Name: " + id.name());
        System.out.println("Department: " + dept.dept());
    }
}


// In the code, "student" is the superclass and "idCard" and "department" are subclasses.

//super class
class student {
    public int rollno(){ 
        int rollno = 11;
        return rollno;
    }
}

//sub class
class idCard extends student {
    public String name(){
        String name = "Arthi";
        return name;
    }
}
//sub class
class department extends student {
    public String dept(){
        String dept = "CSE";
        return dept;
    }
}