package Lab11;

public class Book
{
    /* at the very beginning we need to create instance variables **/

    private String title;

    private String author;


    /* once we have it we have to create a constructor that allows a user to input instance variables **/

    public Book(String title,String author)
    {   this.title=title;
        this.author=author;

    }


    public Book()

    {

        this.title="Test";

        author=null;

    }

    /* then we have to create an accessor method for each of the instance variables created above to retun whatever
     * has been inputted by the user
     */

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }


    /*  mutator method for each of the instance variables created above
     *
     */

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }




    /*  toString method that returns all of the details of the book that has been inputted. **/

    public String toString()
    {
        return  "\""+title+"\" by "+author;
    }



}