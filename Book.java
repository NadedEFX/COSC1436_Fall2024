public class Book
{
    //This is the attributes for the class
    private String title;
    private String price;
    private Author author;
    
        public Book()
        {
            title = "Coraline";
            price = "$10";
        }
        public Book(String title, String price, Author author)
        {
        this.title = title;
        this.price = price;
        this.author = author;
        //This is the getter for attributes
        }
        public String getTitle(){
            return title;
        }
        public String getPrice(){
            return price;
        }
        public Author getAuthor(){
            return author;
        }
        //This is The toString() for the class
        public String toString()
        {
            return ("Book: " + title +"," + " Price: " + price + "," + " Author: " + author + ",");
        }
}