package com.coderscampus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileService {

    public static Student[] readStudents(String masterFile) {
        Student[] students = new Student[100];

        try (BufferedReader br = new BufferedReader(new FileReader(masterFile))) {
            String line;
            br.readLine(); // reads the first line
            int index = 0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String course = data[2];
                int grade = Integer.parseInt(data[3]);
                students[index++] = new Student(id, name, course, grade);
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
        return students;
    }


}
