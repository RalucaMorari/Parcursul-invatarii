package GestiuneaBibliotecii;

public class Client extends User {
    private String[] borrowedBooksCodes;

    public Client(String name, String[] borrowedBooksCodes) {
        super(name);
        this.borrowedBooksCodes = borrowedBooksCodes;
    }
}

    //Atribute
//borrowedBooksCodes - lista ISBNCode-urilor cartilor imprumutate de client
//Metode
//isBookAvailable() - Va cauta o carte in biblioteca dupa ISBNCode si va afisa daca este sau nu disponibila pentru imprumut
//viewAvailableBooks() - va afisa in consola toate cartile disponibile din biblioteca
// (adica cartile care au borrowedNumberOfBooks mai mic de cat totalNumberOfBooks)
//borrowBook() - va imprumuta o carte din biblioteca dupa ISBNCode, ceea ceva avea doua efecte: Codul cartii imprumutate va fi adaugat in lista de coduri a clientului si In acelasi timp, cartii cu acelasi ISBNCode din lista de carti din librarie ii va fi incrementat atributul borrowedNumberOfCopies cu 1. Atentie! Operatia de imprumutare nu va fi posibila pentru o carte daca borrowedNumberOfCopies este egal cu totalNumberOfCopies
//returnBook() - va returna o carte in biblioteca dupa ISBNCode, ceea ce va avea doua efecte: Codul ISBNCode va disparea din lista de coduri ale clientului si In acelasi timp, cartii cu acel ISBNCode din lista de carti a bibliotecii ii va fi decrementat atributul borrowedNumberOfCopies cu 1. Atentie: toate metodele vor trebui sa primeasca ca parametru in plus o biblioteca


//    public boolean isBookAvailable(String ISBMCode, String library) {
//        for(int i = 0; i < borrowedBooksCodes.length; i++){
//        return true;
//
//  }
//
//    public void viewAvailableBooks() {
//        System.out.println();
//    }
//
//    public String borrowBook(String ISBMCode) {
//        return ISBMCode;
//    }
//
//    public String returnBook(String ISBMCode) {
//        return ISBMCode;
//    }
//}

