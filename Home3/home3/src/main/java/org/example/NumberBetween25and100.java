package org.example;
/*
Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет,
попадает ли переданное число в интервал (25;100). (код приложен в презентации)
 */
public class NumberBetween25and100 {
    public boolean numberInInterval(int n) {
        return n>25 && n <= 100;
    }
}
