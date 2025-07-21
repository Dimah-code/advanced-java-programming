package Unit_4.Exercises.Exercise_6;
public class Student {
    String firstName;
    String lastName;
    int age;
    String studentId;
    String major;
    int entryYear;
    double gpa;
    String[] currentCourses;
    String email;
    boolean isInternational;

    public Student(String firstName, String lastName, int age, String studentId, String major, int entryYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.entryYear = entryYear;
        this.gpa = 0.0;
        this.currentCourses = new String[0];
        this.email = studentId + "@university.edu";
        this.isInternational = false;
    }

    public void enrollInCourse(String courseName) {
        String[] newCourses = new String[currentCourses.length + 1];
        for (int i = 0; i < currentCourses.length; i++) {
            newCourses[i] = currentCourses[i];
        }
        newCourses[newCourses.length - 1] = courseName;
        currentCourses = newCourses;
        System.out.println(firstName + " registered for " + courseName);
    }

    public void dropCourse(String courseName) {
        int index = -1;
        for (int i = 0; i < currentCourses.length; i++) {
            if (currentCourses[i].equals(courseName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            String[] newCourses = new String[currentCourses.length - 1];
            int j = 0;
            for (int i = 0; i < currentCourses.length; i++) {
                if (i != index) {
                    newCourses[j++] = currentCourses[i];
                }
            }
            currentCourses = newCourses;
            System.out.println(firstName + " dropped " + courseName);
        } else {
            System.out.println("Course not found.");
        }
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
        System.out.println("Updated GPA: " + newGPA);
    }

    public void printStatus() {
        System.out.println("----- Student Info -----");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Email: " + email);
        System.out.println("Courses: ");
        for (String c : currentCourses) {
            System.out.println(" - " + c);
        }
    }
}

