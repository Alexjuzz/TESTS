package org.example.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> listUser;

    public UserRepository() {
        listUser = new ArrayList<>();
    }

    public static List<User> getListUser() {
        return listUser;
    }

    public boolean addUserToRepo(User user) {
        if (user.getClass() == User.class) {
            listUser.add(user);
            return true;

        }
        return false;
    }

    public int countAdmins() {
        int count = 0;
        for (User us : getListUser()) {
            if (us.isAdmin()) count++;
        }
        return count;
    }
    public void LogOutAllUser(){
        for (User u: listUser
             ) {
            u.setLogin(false);
        }
    }

}
