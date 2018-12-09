package building;
import library.Book;
class House {
   House(){
    Book book = new Book();
    String author = book.Author;
    book.modifyTemplate(); 
  }
}
  