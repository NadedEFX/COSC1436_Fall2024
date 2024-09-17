public class Author
{
    // Author class attributes
    private String name;
    private String email;
    private String nationality;
    
        public Author()
    {
        name = "Neil Gaiman";
        email = "mheifetz@writershouse.com";
        nationality = "British";
    }
    public Author(String name)
    {
        this.name = name;
    }
    public Author(String email, String nationality)
    {
        this.email = email;
        this.nationality = nationality;   
    }
    // This is the getter for the class
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getNationality(){
        return nationality;
    }
    // The toString() of the program
    public String toString()
    {
        return ( name +" Email: " + email + "," + " Nationality: " + nationality);
    }
}