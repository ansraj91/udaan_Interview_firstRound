package com.model.Entity;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity @Table
public class User {
    @Column(name = "userId",unique = true)
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @Column
    private String password;
    @Column
    private String type;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public User(String password, String type) {
        this.password = password;
        this.type = type;
    }

}
