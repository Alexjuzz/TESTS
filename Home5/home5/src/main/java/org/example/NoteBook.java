package org.example;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class NoteBook {
    private final String nameNote;
    private final Map<Integer, User> userMap;
    private int currentUserId = 1;

    public NoteBook(String nameNote) {
        this.nameNote = nameNote;
        this.userMap = new HashMap<>();
    }

    public String getNameNote() {
        return nameNote;
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void addUser(String nameUser, String secondNameUser, String textComment, int phoneNumber) {
        User user = new User(nameUser, secondNameUser, new Comment(textComment), phoneNumber);
        userMap.put(currentUserId, user);
        currentUserId++; // Увеличиваем текущий идентификатор для следующего пользователя
    }

    public void removeUser(int userId) {
        userMap.remove(userId);
    }

    // Другие методы для работы с пользователями
}
