package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();

        User user1 = new User();
        user1.setAccount("ngoc");
        user1.setPassword("123456");
        user1.setName("Ngoc");
        user1.setEmail("ngoc@codegym.vn");
        user1.setAge(21);
        users.add(user1);

        User user2 = new User();
        user2.setAccount("vinh");
        user2.setPassword("123456");
        user2.setName("Vinh");
        user2.setEmail("vinh@.codegym.vn");
        user2.setAge(20);
        users.add(user2);
    }

    public static User checkLogin(Login login){
        for (User user: users){
            if (user.getAccount().equals(login.getAccount())
            && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
