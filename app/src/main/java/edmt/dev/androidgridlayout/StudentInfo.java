package edmt.dev.androidgridlayout;

public class StudentInfo {
    String email, password, name, institute;

    public StudentInfo(String email, /*String password,*/ String name, String institute) {
        this.email = email;
        //this.password = password;
        this.name = name;
        this.institute = institute;
    }

    public String getEmail() {
        return email;
    }

    /*public String getPassword() {
        return password;
    }*/

    public String getName() {
        return name;
    }

    public String getInstitute() {
        return institute;
    }

    public StudentInfo() {
    }
}
