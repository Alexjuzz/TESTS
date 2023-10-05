import org.example.Book;
import org.example.BookRepository;
import org.example.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestBookService {
    BookService bookService;
    Book book = new Book("test11","test23",2);
    Book book2 = new Book("test11","test23",3);
    @BeforeEach
    void testInit(){
        bookService = new BookService();
        bookService.bookList.put(1,book);
        bookService.bookList.put(2,book2);

    }

    /**
     * Тест для проверки извлечения по Id книги.
     * Добавили один обьект в bookService и проверили соответсвует ли возращенный обьект.
     */
    @Test
    void testGetBookById(){
        assertEquals(book,bookService.getBookById(bookService.bookList,1));
    }


    /**
     * Проверяем на то, что при передаче не валидных данных нам возвращается NULL
     * @param i - запредельные значения.
     */
    @ParameterizedTest
    @ValueSource(ints = {-1,100,})
    void testGetBookByIdIncorrectValues(int i){
        assertEquals(null,bookService.getBookById(bookService.bookList,i));
    }

    /**
     * Проверка путем отправления строки получения нужного нам ответа, имитация запроса к SQL
     */
    @Test
    void testGetBookBySqlRequest(){
        BookService bookService1 = mock(BookService.class);
        when(bookService1.getBookBySqlRequest("SELECT BOOK FROM BOOKS WHERE ID = 1")).thenReturn("testBook testBook id =123");


    }
}
