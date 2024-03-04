
package com.mycompany.ejercicios_programacion1;
import books.Book;

public class ejercicios {
    
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", 5, "25", "Fantasia");
        Book book2 = new Book("El nombre del viento", 7, "32", "Fantasia");
        
        
        //Presto el libro
        
        book1.lendBook();
        
        System.out.println(book1.isAvailable());
        System.out.println(book1.isAvailable());
        
    }
    }
