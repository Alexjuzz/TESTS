package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public void addContact(String nameUser, String secondNameUser, String textComment, int phoneNumber) {
        User user = new User(nameUser, secondNameUser, new Comment(textComment), phoneNumber);
        userMap.put(currentUserId, user);
        currentUserId++; // Увеличиваем текущий идентификатор для следующего пользователя
    }

    public List<User> findUsersByName(String nameToFind) {
        List<User> usersFound = new ArrayList<>();

        for (User user : userMap.values()) {
            if (user.getFirstName().equals(nameToFind)) {
                usersFound.add(user);
            }
        }

        return usersFound;
    }
    public User findUserById(int userId) {
        return userMap.get(userId);
    }

    public void removeUser(int userId) {
        userMap.remove(userId);
    }
}
