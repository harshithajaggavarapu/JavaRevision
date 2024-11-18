public class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;
    static{
        totalBooks =0;// executed only once in entire life time of class
    }
    {
        totalBooks++; //normal block is executed everytime an object is created
    }


    Book(String title,String author, int isbn){
        this.title  = title;
        this.author = author;
        this.isbn = isbn;
        // totalBooks++ , can be written here also but used normal code block
    }
    Book(int isbn){
        this("unknown","unknown",isbn);
    }
     static int getTotalBooks(){
        return totalBooks;
    }

     void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Borrowed the book");
        }
    }
     void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("return is successful");
        }else {
            System.out.println("Book is already present in our library");
        }
    }

    //  make an object of this book inside static method and use it
    public static void main(String[] args) {
        System.out.println(Book.getTotalBooks());
        Book book1 = new Book(1345);
        System.out.println(Book.getTotalBooks());
        book1.returnBook();
        book1.borrowBook();
        book1.returnBook();
    }
}
