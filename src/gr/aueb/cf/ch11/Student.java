package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of a simple Student class.
 * POJO (Plain Old Java Object)
 * Student Java Bean
 */
public class Student {
    private static int studentsCount;
    static Scanner in = new Scanner(System.in);

    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    public Student() {
//        studentsCount = 0; αν εινια final δν μπορει
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
//        studentsCount++; ομοιως
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}