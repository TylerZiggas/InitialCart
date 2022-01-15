// Author: Tyler Ziggas
// Date: February 2021
// This is a servlet that takes in the user inputs and checks whether the inputs are good 
// It also stores them in the JavaBean class to be used in the dynamic jsp page and routes you to said jsp file

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.Order; // Importing the JavaBean class

public class BookOrderServlet extends HttpServlet {
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // If post method is used
        String url = "/index.html"; // Current url
        String action = request.getParameter("action"); // See what the parameter action gives
        if (action == null) { // In the case of null
            action = "return"; 
        }
        if (action.equals("return")) { // If they wish to return after a book order
            url = "/index.html";    
        }
        else if (action.equals("add")) { // Book order is accepted              
            String name = request.getParameter("name"); // Get the parameters of the necessary fields 
            String email = request.getParameter("email");
            String bookTitle = request.getParameter("bookTitle");
            
            if (name.trim().length() == 0 || email.trim().length() == 0 || bookTitle.trim().length() == 0 || 
                    email.matches("^(.+)@(.+)$") == false) { // Make sure they are not whitespace and that the email is good to go
                action = "return";
                url = "/index.html";
            } else { // If not, continue, store it, and go to the thank you page
                Order order = new Order(name, email, bookTitle);
        
                request.setAttribute("order", order);
                url = "/thankyou.jsp";  
            }
        }
        getServletContext().getRequestDispatcher(url).forward(request, response); // Takes user to wherever they go based on above knowledge
    }  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // If get method is used
        doPost(request, response);
    }    
}