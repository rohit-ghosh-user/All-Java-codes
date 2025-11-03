public class Course {
    static int maxCapacity;
    String courseName;
    int enrollments;
    String [] enrolldStudents;


    static {
        maxCapacity = 5;
    }
    {
        maxCapacity--;
    }

    Course(String courseName,int enrolldStudents){
       this.courseName = courseName;
       this.enrollments = 0;
       this.enrolldStudents = new String [maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName){
        enrolldStudents[enrollments] = studentName;
        enrollments++;
    }
    void unEnrolledStudents(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

    public static void main(String[] args) {
        Course designCourse = new Course("ECE",2);
    }

}
