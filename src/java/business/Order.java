// Author: Tyler Ziggas
// Date: February 2021
// JavaBean class that stores the information

package business;

import java.io.Serializable;

public class Order implements Serializable {

    private String name; // Creating of the name variable
    private String email; // Creating of the email variable
    private String bookTitle; // Creating of the book title variable

    public Order() { // First initialization of the class order
        name = "";
        email = "";
        bookTitle = "";
    }
    
    public String getName() { // Getter for name
        return name;
    }

     public String getEmail() { // Getter for email
        return email;
    }
     
     public String getBookTitle() { // Getter for book title
        return bookTitle;
    }

    public Order(String name, String email, String bookTitle) { // Setter for the order class
        this.name = name;
        this.email = email;
        this.bookTitle = bookTitle;
    }

    public void setName(String name) { // Setter for name
        this.name = name;
    }
    
    public void setEmail(String email) { // Setter for email
        this.email = email;
    }

    public void setBookTitle(String bookTitle) { // Setter for book title
        this.bookTitle = bookTitle;
    }
}
