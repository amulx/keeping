package com.amu.chen.keeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler","fieldHandler"})
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",nullable = true,length = 32)
    private String username;

    @Column(name = "password",nullable = true,length = 32)
    private String password;

    @Column(name = "age",nullable = true,length = 11)
    private Integer age;

    /*
     * 性别 1=男 2=女 3=保密
     */
    @Column(name = "sex",nullable = true,length = 11)
    private Integer sex;

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
