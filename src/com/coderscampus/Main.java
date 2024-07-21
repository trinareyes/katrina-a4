package com.coderscampus;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String masterFile = "master_list.txt";
        Student[] students = FileService.readStudents(masterFile);
        String[] courses = {"COMPSCI", "APMTH", "STAT"};
        for (int i = 0; i < courses.length; i++) {
            Student[] courseStudents = main.courseOrder(students, courses[i]);
            main.gradeOrder(courseStudents);
            main.writeStudentsToFile(courseStudents,"course" + (i+1) + ".csv");
        }

    }

    public Student[] courseOrder(Student[] students, String course) {
        Student[] orderStudents = new Student[students.length];
        int index = 0;
        for (Student student : students) {
            if (student != null && student.getCourse().contains(course)) {
                orderStudents[index++] = student;

            }
        }
        return orderStudents;
    }

    public void gradeOrder(Student[] students) {
        try {
            Arrays.sort(students, (a, b) -> {
                if (a == null && b == null) return 0;
                if (a == null) return 1;
                if (b == null) return -1;
                return b.getGrade() - a.getGrade();
            });
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public void writeStudentsToFile(Student[] students, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Student ID, Student Name, Student Course, Student Grade\n");
            for (Student student: students) {
                if (student != null) {
                    fw.write(student + "\n");

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
