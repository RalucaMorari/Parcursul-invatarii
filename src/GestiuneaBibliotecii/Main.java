package GestiuneaBibliotecii;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("A", "a", 111, 5,0);
        Book book2 = new Book("B", "b", 112, 7,0);
        Book book3 = new Book("C", "c", 113, 9,0);
        Book[]bookList = new Book[100];
        Library library = new Library(bookList);
        System.out.println(bookList);
    }
}
