package com.example.topquiz.modele;


public class User {
    private String mFirstName;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstname) {
        mFirstName = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstName + '\'' +
                '}';
    }
}
