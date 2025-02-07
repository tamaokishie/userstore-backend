package com.tamaokishie.userstore.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserstoreController {
    
    private final List<String> users = new ArrayList<>();

    // Userを追加する
    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        users.add(user.getName());
    }
    
    // User一覧を取得する
    @GetMapping("/users")
    public List<String> getUser() {
        return users;
    }
    
}

// ユーザーデータ用のクラス
class User {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
