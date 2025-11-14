package lesson10.homework;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String email;
    private int age;

    public User(String username, String mail, int i) {
        this.username = username;
        this.email = mail;
        this.age = i;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
