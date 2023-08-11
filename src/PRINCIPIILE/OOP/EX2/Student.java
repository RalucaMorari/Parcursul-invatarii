package PRINCIPIILE.OOP.EX2;

public class Student extends Person {

    private String groupClass;

    public Student(String firstname, String lastname, String groupClass) {
        super(firstname, lastname);
        this.groupClass = groupClass;
    }


    public String getGroupClass() {
        return groupClass;
    }



    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }

    public void introduce(){

        System.out.println("I am " + getFirstname() + getLastname() + ", I am in " + groupClass + " and I am a student.");
    }
}
