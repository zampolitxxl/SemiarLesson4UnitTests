package org.example;

import Seminar4HomeWork.Book;
import Seminar4HomeWork.BookRepository;
import Seminar4HomeWork.BookService;
import Seminar4HomeWork.InMemoryBookRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Класс BOOK
        //Создаем бук
        Book book = new Book("55");
        //гет айди проверяем
        System.out.println(book.getId());

        //Интерфейс BookRepository
        //создаем объект
        InMemoryBookRepository mem = new InMemoryBookRepository();
        //проверяем
        //Book testBook = new Book("2");
        System.out.println("findById " + mem.findById("1"));
        System.out.println("findAll " + mem.findAll());

        //BookService класс

        BookService bookService = new BookService(mem);

        System.out.println( "bookService.findBookById "+ bookService.findBookById("1")) ;


        System.out.println( "bookService.findBookById "+ bookService.findAllBooks()) ;



    }
}