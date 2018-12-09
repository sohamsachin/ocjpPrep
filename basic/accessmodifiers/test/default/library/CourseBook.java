package library;

class CourseBook extends Book{
  CourseBook() {
    Book book = new Book();
    int issueCount = book.issueCount;
    book.issueHistory(); 
  }
}