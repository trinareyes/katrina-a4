import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        Student[] students = parseMasterListFile("master_list.txt");

        ArrayList<Student> course1Students = new ArrayList<>();
        ArrayList<Student> course2Students = new ArrayList<>();
        ArrayList<Student> course3Students = new ArrayList<>();

        for (Student student : students) {
            if (student.getCourse().equals("course 1")) {
                course1Students.add(student);
            } else if (student.getCourse().equals("course 2")) {
                course2Students.add(student);
            } else if (student.getCourse().equals("course 3")) {
                course3Students.add(student);
            }

        }
        sortStudentsByGrade(course1Students);
        sortStudentsByGrade(course2Students);
        sortStudentsByGrade(course3Students);


        writeStudentToCSV("course1.csv", course1Students);
        writeStudentToCSV("course2.csv", course2Students);
        writeStudentToCSV("course3.csv", course3Students);
    }

    private static void writeStudentToCSV(String s, ArrayList<Student> course1Students) {
    }

    private static void sortStudentsByGrade(ArrayList<Student> course1Students) {

    }

    private static Student[] addStudentToArray(Student[] course1Students, Student student) {
    }

    private static Student[] parseMasterListFile(String file) {
    }


}