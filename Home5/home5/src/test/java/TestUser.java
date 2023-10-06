import org.example.Comment;
import org.example.User;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestUser {
    User user;
    Comment comment;
    @Test
    void testUser(){
        comment = new Comment("Text to contact");
        user = new User("Vova","Ivanov",comment,912949);
    }
}
