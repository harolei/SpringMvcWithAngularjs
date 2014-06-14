package com.leiyu.springREST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User
{
    @Column(name="Username")
    private String username;
    @Column(name="Password")
    private String password;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public User() {}

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}
