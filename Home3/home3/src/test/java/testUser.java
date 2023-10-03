import org.example.User.User;
import org.example.User.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class testUser {
    static UserRepository testrepository;

    User user1;
    User user2;
    User user3;
    User admin;



    @BeforeEach
    void  testInit(){
        user1= new User("1231","User1");
        user2= new User("123","User2");
        user3= new User("123","User3");
        admin= new User("admin","admin");
        testrepository = new UserRepository();
        testrepository.addUserToRepo(user1);
        testrepository.addUserToRepo(user2);
        testrepository.addUserToRepo(user3);
        testrepository.addUserToRepo(admin);
    }

    @Test
    void testLogInForUser(){
        assertTrue(user1.isLogin());
    }
    @Test
    void testLogOutForUser(){
        user1.setLogin(false);
        assertFalse(user1.isLogin());
    }

    /**
     * testLogOutForAdmin()
     * Установка прав setAdmin(true) для User-a,
     * После попытка разлогинить путем вызова admin.setLogin(false)
     */
    @Test
    void testLogOutForAdmin(){
        admin.setAdmin(true);
        admin.setLogin(false);
        assertTrue(admin.isLogin());
    }

    @Test
    void testAll(){
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        actual.add(admin);
        assertEquals(actual, UserRepository.getListUser());
    }

    /**
     * НЕ понял как правильно было бы проверить данный метод.
     * Логика в данной проверке простая:
     * - берем список всех пользователей и вызываем метод LogOut
     * - Потом проверяем что пользователь не Admin если верно, то меняем его статус.
     */
    @Test
    void testLogOutAllUser(){
        for (User u : UserRepository.getListUser()
             ) {
            u.setLogin(false);
           if(!u.isAdmin()){
               assertFalse(u.isLogin());
           }
        }
    }

    /**
     * Ещё одна попытка написать тест для метода, тут логика такая:
     * Берем репозиторий где все пользователи.
     * Устанавливаем админа
     * Вызываем метод который всех разлогинивает.
     * Проверяем всех пользователей если обычный
     * Юзер то isLogin должен быть false
     * Если админ, то ассерт должен быть true
     */
    @Test
    void testLogOutUsers(){
        admin.setAdmin(true);
        testrepository.LogOutAllUser();
        assertFalse(user1.isLogin());
        assertFalse(user2.isLogin());
        assertFalse(user3.isLogin());
        assertTrue(admin.isLogin());
    }

}
