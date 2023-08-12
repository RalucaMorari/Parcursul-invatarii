package PRINCIPIILE.OOP.EX2.IntroducePersonInSchool;

public class Teacher extends Person {

    private String department;
    private String subject;

    public Teacher(String firstname, String lastname, String department, String subject) {

        super(firstname, lastname);
        this.department = department;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }
    public void introduce() {
        System.out.println("I am " + getFirstname() + getLastname() + " , I teach" +  getSubject() + " and I am a " + getDepartment());
    }
}




