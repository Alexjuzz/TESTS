import org.example.Comment;
import org.example.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestUser {
    User user;
    Comment comment;

    @BeforeEach
    void testInit() {
        comment = new Comment("Text to contact");
        user = new User("Vova", "Ivanov", comment, 912949);

    }
    @Test
    void testGetNameUser() {
        // Проверяет, что имя пользователя не пустое.
        assertFalse(user.getFirstName().isEmpty());
    }

    @Test
    void testGetSecondNameUser() {
        // Проверяет, что фамилия пользователя не пустая.
        assertFalse(user.getSecondName().isEmpty());
    }

    @Test
    void testGetNumberUser() {
        // Проверяет, что номер пользователя находится в допустимом диапазоне.
        assertFalse(user.getNumber() >= 1 && user.getNumber() < 999999999);
    }

    @Test
    void testSetUserName() {
        // Проверяет, что метод setFirstName корректно устанавливает имя пользователя.
        user.setFirstName("KOLA");
        assertEquals("KOLA", user.getFirstName());
    }

    @Test
    void testSetSecondNameUser() {
        // Проверяет, что метод setSecondName корректно устанавливает фамилию пользователя.
        user.setSecondName("PETROV");
        assertEquals("PETROV", user.getSecondName());
    }

    @Test
    void testChangeNumber() {
        // Проверяет, что метод setNumber корректно изменяет номер пользователя.
        user.setNumber(49129392);
        assertEquals(49129392, user.getNumber());
    }

}
