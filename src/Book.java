public class Book {
   String title;
   static int bookCount;

   public Book(String title) {
       this.title = title;
       this.bookCount = ++bookCount;
   }
   static int getBookCount() {
       return bookCount;
   }
}
