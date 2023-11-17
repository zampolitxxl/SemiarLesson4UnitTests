import Seminar4HomeWork.Book;
import Seminar4HomeWork.BookRepository;
import Seminar4HomeWork.BookService;
import Seminar4HomeWork.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import weather.WeatherReporter;
import weather.WeatherService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class Seminar4HomeWorkTest {

    @Test
    public  void BookTestFindById() {

        BookRepository  mem = mock(BookRepository.class);

        BookService bookService = new BookService(mem);

        Book testbook = new Book("777");

        when(bookService.findBookById("1")).thenReturn(testbook);

        assertThat(bookService.findBookById("1")).isEqualTo( testbook);
    }
    @Test
    public  void BookTestFindAll() {

        BookRepository  mockBookRepository = mock(BookRepository.class);

        BookService bookService = new BookService(mockBookRepository);


        List<Book> testbooksList = null;

        when(bookService.findAllBooks()).thenReturn((List<Book>) testbooksList);

        assertThat(bookService.findAllBooks()).isEqualTo( testbooksList);
    }


    //findBookById(String id)

    //findAllBooks()
}
