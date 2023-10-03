package org.example.User;

public class User {
    private String password;
    private String login;
    private boolean isAdmin;
    private boolean isLogin;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
        this.isAdmin = false;
        this.isLogin = true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
