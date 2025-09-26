package Week2.ManagerStudent;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("23020819", "Phan xuan hon", "E-CE1", "23020819@gmail.com");
        Student s1 = new Student("23020819", "Phan xuan hon", "E-CE1", "23020819@gmail.com");
        Student s2 = new Student("23020818", "Phan xuan hon", "c-CE1", "23020819@gmail.com");
        Student s3 = new Student("23020819", "Phan xuan hon", "c-CE1", "23020819@gmail.com");
        StudentManagement sm = new StudentManagement();
        sm.addStudent(s);
        sm.addStudent(s1);
        sm.addStudent(s2);
         sm.addStudent(s3);
         sm.removeStudent("23020819");
        System.out.println(sm.studentsByGroup());
    }
}
