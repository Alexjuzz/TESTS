package org.example;
//          У вас есть класс BookService, который использует интерфейс BookRepository для
//        получения информации о книгах из базы данных. Ваша задача написать unit-тесты
//        для BookService, используя Mockito для создания мок-объекта BookRepository.

import java.util.Map;

public interface BookRepository {
    public Book getBookById(Map<Integer, Book> listOfBooks,int id);
    public String getBookBySqlRequest(String request);

}
