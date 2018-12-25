package com.example.springboot.test;

public class single {
    private String id;

    private String name;

    private void single(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "single{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
