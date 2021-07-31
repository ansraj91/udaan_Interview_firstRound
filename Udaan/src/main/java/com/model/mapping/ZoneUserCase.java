package com.model.mapping;

import com.model.Entity.User;
import com.model.Entity.Zone;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class ZoneUserCase {
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public ZoneUserCase(User user, Zone zone) {
        this.user = user;
        this.zone = zone;
    }

    @OneToOne
    private User user;
    @ManyToMany
    private Zone zone;




}
