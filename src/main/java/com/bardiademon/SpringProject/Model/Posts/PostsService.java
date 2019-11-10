package com.bardiademon.SpringProject.Model.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsService
{

    public final PostsRepository Repository;

    @Autowired
    public PostsService (PostsRepository Repository)
    {
        this.Repository = Repository;
    }

}
