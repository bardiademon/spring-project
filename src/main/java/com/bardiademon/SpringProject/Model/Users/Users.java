package com.bardiademon.SpringProject.Model.Users;

import com.bardiademon.SpringProject.Model.Posts.Posts;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "users")
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Users
{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column (unique = true)
    private String username;

    private String password;

    @Column (unique = true)
    private String email;

    @Column (unique = true)
    private String phone;

    @Column (name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column (name = "updated_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime updatedAt;


    @OneToMany
    private List<Posts> posts;

    public Users ()
    {
    }

    public Users (String Username , String Password , String Email , String Phone , LocalDateTime createdAt , LocalDateTime updatedAt , List<Posts> LstPosts)
    {
        this.username = Username;
        this.password = Password;
        this.email = Email;
        this.phone = Phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.posts = LstPosts;
    }

    public long getId ()
    {
        return id;
    }

    public void setId (long id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (LocalDateTime updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public List<Posts> getPosts ()
    {
        return posts;
    }

    public void setPosts (List<Posts> posts)
    {
        this.posts = posts;
    }
}
