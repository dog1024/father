package com.zdk.api.domain;

import lombok.Data;

import java.io.Serializable;


@Data
public class User implements Serializable {

    private static final long serialVersionUID = 3900317861375651128L;

    private String  id;

    private String name;

    public User(){}

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
