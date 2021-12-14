package com.example.sharingapp;

import java.util.UUID;

public class Contact {
    private String username;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        setUsername(username);
        setEmail(email);
        if(null!=id){
            updateId(id);
        }else{
            setId();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }
    public void updateId(String id) {
        this.id = id;
    }
}
