package org.example;


public class User {
    private String firstName;
    private String secondName;
    private  long number;
    private Comment comment;


    public User(String firstName, String secondName, Comment comment, long phoneNumber) {
        if(firstName.isEmpty() || secondName.isEmpty() || phoneNumber <0 || phoneNumber > 999999999 ){
            throw new RuntimeException("Данные неверны");
        }else {
            this.number = phoneNumber;
            this.firstName = firstName;
            this.secondName = secondName;
            this.comment = comment;
        }

    }


    public String getFirstName() {
        return firstName;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + " Фамилия: " + getSecondName() + " Номер: " + getNumber();
    }
}
