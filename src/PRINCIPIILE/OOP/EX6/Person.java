package PRINCIPIILE.OOP.EX6;

public class Person {
    //firstName
    //lastName
    //accountList - adică un array care ține lista de conturi ale unei persoane


    private String firstname;
    private String lastname;
    private int [] accountList;

    public Person(String firstname, String lastname, int[] accountList) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountList = accountList;
    }

    public int[] getAccountList() {
        return accountList;
    }

    public void setAccountList(int[] accountList) {
        this.accountList = accountList;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean addAcount(){
        return true;
    }
    //Metode:
    //
    //Metoda addAccount() - va da posibilitatea persoanei să adauge un cont în lista de conturi
    //Metoda listAccounts() - va printa accountNumber împreună cu balance pentru fiecare cont din listă
    //Metoda deposit() - va adăuga o anumită sumă de bani într-un cont
    //Metoda withdraw() - va retrage o anumită sumă de bani dintr-un cont
    //Metoda checkAccountDetails() - va printa toate detaliile unui anumit cont

    public void listAccounts(){
        System.out.println();
    }
    public boolean deposit(int amount){
        return true;
    }

    public boolean withdraw(int amount){
        return true;
    }
    public void checkAccountDetails(){
        System.out.println();
    }
}
