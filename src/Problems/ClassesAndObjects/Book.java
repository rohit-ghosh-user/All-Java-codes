public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;


    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String isbn){
        this("Unknown","Unknown",isbn);
    }

    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is alredy borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book "+this.title);
        }

    }
    void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("Hope you enjoyed the book");
        }
        else {

            System.out.println("Book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design","author","1");
        Book newBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        newBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        newBook.returnBook();
        newBook.returnBook();
        System.out.println(Book.getTotalBooks());
    }
}
