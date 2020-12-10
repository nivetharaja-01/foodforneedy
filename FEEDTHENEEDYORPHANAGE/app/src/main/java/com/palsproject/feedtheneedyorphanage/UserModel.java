package com.palsproject.feedtheneedyorphanage;

public class UserModel {
    String name,orphanname,email;

    public UserModel(String name,String orphanname, String email, String dob) {
        this.name = name;
        this.email = email;
        this.orphanname = orphanname;
    }

    public UserModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrphanname() {
        return orphanname;
    }

    public void setOrphanname(String orphanname) {
        this.orphanname = orphanname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}