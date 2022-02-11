package com.intiformation.app.model;

public class Place {
    private long id;
    private String name;

    // Constructor
    public Place() {
    }

    // Getter
    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    // Setter
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
