package org.example;

import org.example.User.User;
import org.example.User.UserRepository;

/*
Условия к ДЗ (архив)
*Задание 1.

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
является ли переданное число четным или нечетным. (код приложен в презентации)

Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет,
попадает ли переданное число в интервал (25;100). (код приложен в презентации)

Задание 3.  (необязательное)
Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
 кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
  указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.

*Формат сдачи: *воспользуйтесь одним из вариантов: Ссылка на репозиторий
 Git или Прикрепленный архив
 */
public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user1 = new User("1231", "User1");
        User user2 = new User("123", "User2");
        User user3 = new User("123", "User3");
        User admin = new User("admin", "admin");
        userRepository.addUserToRepo(user1);
        userRepository.addUserToRepo(user2);
        userRepository.addUserToRepo(user3);
        userRepository.addUserToRepo(admin);


    }
}