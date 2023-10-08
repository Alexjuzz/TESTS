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
        assertFalse(user.getFirstName().isEmpty());
    }

    @Test
    void testGetSecondNameUser() {
        assertFalse(user.getSecondName().isEmpty());
    }

    @Test
    void testGetNumberUser() {
        assertFalse(user.getNumber() >=1  && user.getNumber() < 999999999);
    }
    @Test
    void testSetUserName(){
        user.setFirstName("KOLA");
        assertEquals("KOLA",user.getFirstName());
    }
    @Test
    void testSetSecondNameUser(){
        user.setSecondName("PETROV");
        assertEquals("PETROV",user.getSecondName());
    }
    @Test
    void testChangeNumber(){
        user.setNumber(49129392);
        assertEquals(49129392,user.getNumber());
    }
}
