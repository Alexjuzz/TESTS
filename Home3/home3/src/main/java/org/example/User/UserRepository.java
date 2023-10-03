package org.example.User;

import java.util.List;

public class UserRepository {
    private List<User> listUser;

    public List<User> getListUser() {
        return listUser;
    }
    public boolean addUserToRepo(User user){
        if(user.getClass().isInstance(User.class)) {
            listUser.add(user);
        return true;
        }
        return false;
    }
}
