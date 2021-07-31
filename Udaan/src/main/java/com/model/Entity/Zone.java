package com.model.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zone {
    public long getZoneId() {
        return zoneId;
    }

    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zone(long zoneId, String name) {
        this.zoneId = zoneId;
        this.name = name;
    }

    @Id @NonNull
    private long zoneId;
    @Column
    private String name;
}
