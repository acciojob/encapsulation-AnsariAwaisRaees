package com.driver;

import javax.naming.Name;

public class RWOnly {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
