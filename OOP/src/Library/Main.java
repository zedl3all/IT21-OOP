/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author LAB203_23
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        
        book1.printDetails();
        System.out.println("-------------");
        book1.updatePrice(250);
        book1.markAsAvailable();
        book1.printDetails();
        System.out.println(book1.isPublishedAfter(2000));
    }
}
