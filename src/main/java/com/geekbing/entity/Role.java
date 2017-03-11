package com.geekbing.entity;

import javax.persistence.*;

/**
 * Author: bing
 * Date: 2017-03-11 10:07
 * Email: dhuzbb@163.com
 */

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;           // 角色的名字
    private String description;    // 角色的描述

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
