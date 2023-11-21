package Seminar5;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;
public class Seminar5HWTest {

    @Test
    public  void addingContact(){
        Contact petr = new Contact("Petr", "89215744948");
        Contact falsePetr = new Contact("Petr", "89215744948");

        TextBook textBook = new TextBook(petr);
        Contact result =  textBook.getContact(petr);
        assertThat(result).isEqualTo(petr);

    }

    @Test
    public  void removingContact(){
        Contact petr = new Contact("Petr", "89215744948");

        TextBook textBook = new TextBook(petr);
        textBook.removeContact(petr);
        assertNull(textBook.getContact(petr));

    }

    @Test
    public  void changingContact(){
        Contact petr = new Contact("Petr", "89215744948");

        TextBook textBook = new TextBook(petr);
        textBook.changeContact("Petr", "Ivan", "89602653534");
        assertThat(textBook.getContact(petr).getName()).isEqualTo("Ivan");
    }








}
