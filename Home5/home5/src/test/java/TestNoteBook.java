import org.example.NoteBook;
import org.example.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестовый класс для проверки функциональности классов NoteBook, User.
 */
public class TestNoteBook {
    NoteBook noteBook;

    /**
     * Инициализация тестового окружения перед каждым тестом.
     */
    @BeforeEach
    void testInit() {
        noteBook = new NoteBook("TEST NOTEBOOK");
        noteBook.addContact("Sergex", "Ivanov", "TEXT PRO SERGAY", 123456789);
        noteBook.addContact("Evgenii", "Kypilov", "TEXT", 4564789);
        noteBook.addContact("ANatol", "Xrapov", "TEXT ", 3456789);
        noteBook.addContact("Nikolay", "Ignatev", "TEXT", 156789);
    }

    /**
     * Тест проверяет добавление нового контакта в записную книгу.
     */
    @Test
    void testAddContact() {
        // Проверка добавления нового контакта
        NoteBook noteBook1 = new NoteBook("TestUser");
        noteBook1.addContact("Evgen", "Petrov", "TEXT", 3123);
        assertTrue(noteBook1.getUserMap().containsKey(1));
        assertFalse(noteBook1.getUserMap().isEmpty());
    }

    /**
     * Тест проверяет поиск пользователя по идентификатору.
     *
     * @param i Идентификатор пользователя для поиска.
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testFindById(int i) {
        // Поиск пользователя по идентификатору
        String[] expectedNames = {"Sergex", "Evgenii", "ANatol", "Nikolay"};
        assertEquals(expectedNames[i - 1], noteBook.findUserById(i).getFirstName());
    }

    /**
     * Тест проверяет добавление пользователя и его поиск по имени и идентификатору.
     */
    @Test
    void testAddUserAndFind() {
        // Проверка добавления пользователя и его поиска по имени и идентификатору
        NoteBook noteBook = new NoteBook("My Notebook");
        noteBook.addContact("John", "Doe", "Test comment", 123456789);

        List<User> usersByName = noteBook.findUsersByName("John");
        assertEquals(1, usersByName.size());

        User foundUser = noteBook.findUserById(1);
        assertNotNull(foundUser);
        assertEquals("John", foundUser.getFirstName());
    }

    /**
     * Тест проверяет удаление пользователя из записной книги.
     */
    @Test
    void testRemoveUser() {
        // Проверка удаления пользователя
        int sizeNoteBook = noteBook.getUserMap().size();
        noteBook.removeUser(1);
        assertEquals(sizeNoteBook - 1, noteBook.getUserMap().size());
    }
}


