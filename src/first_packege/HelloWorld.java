package first_packege;

import singlrton.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My name is Anastasiya");
        System.out.println("My last name is Prudnikova");


        Student student = Student.getStudent();
        System.out.println(student);
    }
}


