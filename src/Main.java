public class Main {
    public static void main(String[] args) {


        Student[] students = parseMasterListFile("master_list.txt");

        Student[] course1Students = new Student[0];
        Student[] course2Students = new Student[0];
        Student[] course3Students = new Student[0];

        for (Student student : students) {
            if (student.getCourse().equals("course 1")) {
                course1Students = addStudentToArray(course1Students, student);
            } else if (student.getCourse().equals("Course 2")){
                course2Students = addStudentToArray(course2Students, student);
            } else if (student.getCourse().equals("course 3")) {
                course3Students = addStudentToArray(course3Students, student);
            }

        }


        sortStudentsByGrade(course1Students);
        sortStudentsByGrade(course2Students);
        sortStudentsByGrade(course3Students);


        writeStudentToCSV("course1.csv", course1Students);
        writeStudentToCSV("course2.csv", course2Students);
        writeStudentToCSV("course3.csv", course3Students);
    }

    private static void writeStudentToCSV(String s, Student[] course1Students) {
    }

    private static void sortStudentsByGrade(Student[] course1Students) {

    }

    private static Student[] addStudentToArray(Student[] course1Students, Student student) {
    }

    private static Student[] parseMasterListFile(String file) {
    }


}