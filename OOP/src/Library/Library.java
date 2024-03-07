/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author LAB203_23
 */
public class Library {
    public String libraryName;
    public Book book1, book2, book3;
    
    public void addBook(Book book, int slot){
        switch(slot){
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
        }
    }
    
    public void removeBook(int slot){
        switch(slot){
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
        }
    }
    
    public void printLibraryDetails(){
        System.out.println("Library: "+libraryName);
        System.out.println("");
        printBookDetails(book1);
        System.out.println("----------");
        printBookDetails(book2);
        System.out.println("----------");
        printBookDetails(book3);
        System.out.println("----------");
    }
    
    public void checkBookAvailability(int slot){
        switch(slot){
            case 1:
                if (book1 != null){
                    System.out.println(book1.title+" is available.");
                }else{
                    System.out.println("Book on slot "+slot+" is not available.");
                }
                break;
            case 2:
                if (book2 != null){
                    System.out.println(book1.title+" is available.");
                }else{
                    System.out.println("Book on slot "+slot+" is not available.");
                }
                break;
            case 3:
                if (book3 != null){
                    System.out.println(book1.title+" is available.");
                }else{
                    System.out.println("Book on slot "+slot+" is not available.");
                }
                break;
        }
    }
    
    public void updateBookPrice(int slot, double newPrice){
        switch(slot){
            case 1:
                if (book1 != null){
                    System.out.println("Updated price of "+book1.title+" to $"+newPrice+".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
            case 2:
                if (book2 != null){
                    System.out.println("Updated price of "+book2.title+" to $"+newPrice+".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
            case 3:
                if (book3!= null){
                    System.out.println("Updated price of "+book3.title+" to $"+newPrice+".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
        }
    }
    
    public void printBookDetails(Book book){
        if (book == null){
            System.out.println("No book in this slot.");
        }else{
            System.out.println("Title: "+book.title);
            System.out.println("Author: "+book.author);
            System.out.println("Publisher: "+book.publisher);
            System.out.println("Year Published: "+book.yearPublished);
            System.out.println("Price: $"+book.price);
            if (book.isAvailable){
                System.out.println("Available: Yes");
            }else{
                System.out.println("Available: No");
            }
        }
    }
}
