package org.example.record;

/*
Record is a restricted class in which all variables defined are final and accessible only through getter methods.
Generates a compact canonical constructor that initializes all the components of the record.
Generates getter, equals and hashcode methods to directly print object rather than object hashcode.
Mostly used as data carrier classes.
 */
record Student(int id, String name) {
    // Compact Canonical Constructor
    public Student {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }

//    // Canonical Constructor
//    public Student(int id, String name) {
//        if (id <= 0) {
//            throw new IllegalArgumentException("id must be greater than 0");
//        }
//        this.id = id;
//        this.name = name;
//    }
}

public class Record {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
//        Student student1 = new Student(0, "John"); // will throw IllegalArgumentException
        Student student2 = new Student(1, "John");
        System.out.println(student);
        System.out.println(student.equals(student2));
    }
}
