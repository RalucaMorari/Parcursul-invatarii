package GestiuneaBibliotecii;

public class Admin extends User{

    public Admin(String name) {
        super(name);
    }

    public void addBook(){

    }

    public void deleteBook(){

    }

    public void listAllBooks(){
        System.out.println();
    }

    public void listBookDetails(){
        System.out.println();
    }
    public void viewBorrowedBooks(){
        System.out.println();
    }


    //Metode
    //addBook() - va adauga o carte in lista de carti a bilbiotecii. Daca cartea cu acel ISBNCode exista deja in lista de carti a bibliotecii, atunci doar i se va incrementa valoarea atributului numberOfCopies
    //deleteBook() - Va fi o metoda supraincarcata. Prima varianta va primi doar un paramentru, ISBNCode si va sterge de tot cartea din lista de carti a bibliotecii. A doua varianta va primi doi paremetrii: ISBNCode si numarul de copii care se vor sterge. In acest caz, cartea nu va fi stearsa din lista de carti a bibliotecii, ci doar se va scadea din numarul total de copii al cartii, numarul de copii primit ca parametru
    //listAllBooks() - va printa detaliile fiecarei carti din lista de carti a bibliotecii
    //listBookDetails() - Va printa detaliile unei singure carti din biblioteca, in functie de codul ISBNCode
    //viewBorrowedBooks() - Va lista codurile ISBNCode ale cartilor imprumutate de un client, in functie de numele clientului primi ca parametru. Atentie: toate metodele vor trebui sa primeasca ca parametru in plus o biblioteca
}
