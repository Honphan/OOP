package Week2.ManagerStudent;

public class StudentManagement {
    private static Student[] students = new Student[100];
    private static int index = 0;
    private static int maxIndex = 100;

    /**
     * contructor.
     */
    public void addStudent(Student newStudent) {
        if (index < maxIndex) {
            students[index] = newStudent;
            index++;
        }
    }

    /**
     * contructor.
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        String group = students[0].getGroup();
        result.append(group);
        result.append("\n");
        for (int i = 0; i < index; i++) {
            if (students[i].getGroup().equals(group)) {
                result.append(students[i].getInfo());
                result.append("\n");
            } else {
                group = students[i].getGroup();
                result.append(group);
                result.append("\n");
                result.append(students[i].getInfo());
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * contructor.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < index; ++i) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < index - 1; ++j) {
                    students[j] = students[j + 1];
                }
                index--;
                return;
            }
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

}

