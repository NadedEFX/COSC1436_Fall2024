
public class LibrarySystem
{
    public static void main (String [] args)
    //This will be the object for the book class
    {
        Author author = new Author();
        Book book = new Book("Coraline", "$10", author );
        
        System.out.println(book.toString());
    } 
}