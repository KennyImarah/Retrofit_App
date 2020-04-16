package com.example.retrofitapp;

import androidx.annotation.NonNull;

public class User {

    private long id;
    private String first_name;
    private String last_name;
    private String email;


    @NonNull
    @Override
    public String toString() {
        return "User [id = "+ id + " first name " + first_name + " last name " + last_name + " email " + email + "]";
    }
}
