package PRINCIPIILE.OOP.EX2.IntroducePersonInSchool;

public class Person{
    private String firstname;
    private String lastname;

    public Person (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

        public void introduce() {

    }
}


