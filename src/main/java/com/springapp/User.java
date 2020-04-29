package com.springapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private long Id;
    private String name;
    private String surname;

    //@JsonProperty used to let spring know that it can convert it to a java class
    public User(@JsonProperty("Id") long Id, @JsonProperty("name") String name, @JsonProperty("surname") String surname){
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(long Id){
        this.Id = Id;
    }

    public long getId() {
        return Id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }
}
