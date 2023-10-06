package org.example;

import java.util.HashMap;
import java.util.Map;

public class NoteBook {
    private static int id = 0;
    private String nameNote;
    private final Map<Integer, User> userMap;

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public NoteBook(String textComment, String nameNote, String nameUser, String secondNameUser, int phoneNumber) {
        this.nameNote = nameNote;
        id++;
        userMap = new HashMap<>();
        userMap.put(id, new User(nameUser, secondNameUser, new Comment(textComment), phoneNumber));
    }

    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }
}
