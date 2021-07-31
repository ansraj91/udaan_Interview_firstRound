package com.model.Entity;

import javax.persistence.*;

@Entity
public class RegistrationInfo {
    public RegistrationInfo(String userId, String name, String phoneNo, Zone zone,String type) {
        this.userId = userId;
        this.phoneNo = phoneNo;
        this.name = name;
        this.zone = zone;
        this.type = type;
    }

    @OneToOne
    private String userId;
    @Column
    private String name;
    @Id
    private String phoneNo;
    @OneToMany
    private Zone zone;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column
    private String type;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }



}
