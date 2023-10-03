package org.example.User;
/*
Задание 3.  (необязательное)
Добавьте функцию в класс UserRepository, которая разлогинивает всех
 пользователей, кроме администраторов. Для этого, вам потребуется расширить
  класс User новым свойством,
  указывающим, обладает ли пользователь админскими правами.
  Протестируйте данную функцию.

 */

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
    public String getLogin() {
        return login;
    }
    public boolean isLogin() {
        return isLogin;
    }

    public void setAdmin(boolean b){
        this.isAdmin = b;
    }
    public boolean isAdmin(){
        return this.isAdmin;
    }
    public void setLogin(boolean login) {
        if(!isAdmin) {
            isLogin = login;
        }
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final User t = (User) obj;
        if(this.login != t.login){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Name : " + this.login  + ", Status login :" + isLogin + "\n";
    }
}
