package library;

class Librarian extends Book {
    Librarian(){
    Book book = new Book();
    int issueCount = book.issueCount;
    book.issueHistory();    
}

}