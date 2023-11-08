package week10;

import java.util.ArrayList;

class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class TestResult {
    private int testNumber;
    private int grade;

    public TestResult(int testNumber, int grade) {
        this.testNumber = testNumber;
        this.grade = grade;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public int getGrade() {
        return grade;
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private String courseType;
    private ArrayList<Student> students;
    private ArrayList<TestResult> testResults;

    public Course(String courseCode, String courseName, String courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
        this.students = new ArrayList<>();
        this.testResults = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
    }

    public void addGrade(String studentId, int testNumber, int grade) {
        int studentIndex = findStudentIndex(studentId);
        if (studentIndex != -1 && testNumber >= 1 && testNumber <= 10) {
            testResults.add(new TestResult(testNumber, grade));
        } else {
            System.out.println("Error, student not found or invalid test number.");
        }
    }

    public void printGrade(int testNumber) {
        System.out.print("Test " + testNumber + ": ");
        for (Student student : students) {
            int studentIndex = findStudentIndex(student.getId());
            int grade = getGradeForTest(student.getId(), testNumber);
            System.out.print(student.getName() + " " + grade + ", ");
        }
        System.out.println();
    }

    public void sortGrade(int testNumber) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                int studentIndex1 = findStudentIndex(students.get(i).getId());
                int studentIndex2 = findStudentIndex(students.get(j).getId());
                int grade1 = getGradeForTest(students.get(i).getId(), testNumber);
                int grade2 = getGradeForTest(students.get(j).getId(), testNumber);
                if (grade1 < grade2) {
                    swapStudents(i, j);
                }
            }
        }
    }

    public void updateGrade(String studentId, int grade) {
        // Assuming we are updating test 1
        int studentIndex = findStudentIndex(studentId);
        if (studentIndex != -1) {
            updateGradeForTest(studentId, 1, grade);
        } else {
            System.out.println("Error, student not found.");
        }
    }

    private int findStudentIndex(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(studentId)) {
                return i;
            }
        }
        return -1; // Student not found
    }

    private int getGradeForTest(String studentId, int testNumber) {
        for (TestResult result : testResults) {
            if (result.getTestNumber() == testNumber && students.get(findStudentIndex(studentId)).getId().equals(studentId)) {
                return result.getGrade();
            }
        }
        return 0; // Grade not found
    }

    private void updateGradeForTest(String studentId, int testNumber, int grade) {
        for (TestResult result : testResults) {
            if (result.getTestNumber() == testNumber && students.get(findStudentIndex(studentId)).getId().equals(studentId)) {
                result = new TestResult(testNumber, grade);
                return;
            }
        }
    }

    private void swapStudents(int index1, int index2) {
        Student temp = students.get(index1);
        students.set(index1, students.get(index2));
        students.set(index2, temp);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Course cs176l = new Course("cs176l", "Computer Science", "undergraduate");
        cs176l.addStudent("Cream", "0000001");
        cs176l.addGrade("0000001", 1, 98);
        cs176l.addStudent("Oreo", "0000002");
        cs176l.addGrade("0000002", 1, 99);

        cs176l.printGrade(1);
        cs176l.sortGrade(1);
        cs176l.printGrade(1);

        cs176l.updateGrade("0000001", 100);
        cs176l.printGrade(1);
        cs176l.sortGrade(1);
        cs176l.printGrade(1);

        cs176l.addGrade("0000003", 2, 88); // Error, no student with id '0000003' registered in this class.
        cs176l.addStudent("Derek", "0000003");
        cs176l.addGrade("0000003", 2, 88);

        cs176l.printGrade(2);
    }
}
