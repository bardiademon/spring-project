package com.bardiademon.SpringProject.Model.Posts;

import com.bardiademon.SpringProject.Model.Users.Users;

import javax.persistence.*;

@Entity
@Table (name = "posts")
public class Posts
{
    @Id
    @GeneratedValue
    @Column (name = "id")
    public long id;

    @ManyToOne
    @JoinColumn (name = "id_user", referencedColumnName = "id")
    private Users users;

    @Column (name = "title")
    private String title;

    @Column (name = "body")
    private String body;

    @Column (name = "cover")
    private String cover;

    public Posts ()
    {
    }

    public Posts (Users _Users , String Title , String Body , String Cover)
    {
        this.users = _Users;
        this.title = Title;
        this.body = Body;
        this.cover = Cover;
    }

    public void setId (long id)
    {
        this.id = id;
    }

    public long getId ()
    {
        return id;
    }

    public Users getUsers ()
    {
        return users;
    }

    public void setUsers (Users users)
    {
        this.users = users;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public String getCover ()
    {
        return cover;
    }

    public void setCover (String cover)
    {
        this.cover = cover;
    }
}
