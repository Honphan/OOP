package Week2.ManagerStudent;

public class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    /**
     * contructor.
     */
    public Student(String id, String name, String group, String email) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    /**
     * contructor.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * contructor.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * contructor.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
