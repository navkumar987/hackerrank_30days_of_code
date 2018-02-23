import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book{
 
    

    // Declare the price instance variable
    int price;
    // Write your constructor here
    MyBook (String title,String author,int price)
    {    
        super(title,author);
    this.price = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    @Override
    void display(){
        System.out.print("Title: "+title+" \nAuthor: "+author+" \nPrice: " +price);
    }
 }   