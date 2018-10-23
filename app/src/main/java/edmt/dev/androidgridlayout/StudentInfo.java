package edmt.dev.androidgridlayout;

public class StudentInfo {
    String email, name, institute;

    public StudentInfo(String email, String name, String institute) {
        this.email = email;
        this.name = name;
        this.institute = institute;
    }


    public StudentInfo() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
