package com.bardiademon.SpringProject;

import com.bardiademon.SpringProject.Model.Posts.Posts;
import com.bardiademon.SpringProject.Model.Posts.PostsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/posts")
public class RestPosts
{

    private final PostsService Service;

    public RestPosts (PostsService Service)
    {
        this.Service = Service;
    }


    @PostMapping (value = "/add")
    public Posts addNew (@RequestBody Posts posts)
    {
        return Service.Repository.save (posts);
    }

    @PostMapping ("/add_lst")
    public List<Posts> addNew (@RequestBody List<Posts> posts)
    {
        return Service.Repository.saveAll (posts);
    }


    @GetMapping ("/get_all")
    public List<Posts> getAll ()
    {
        return Service.Repository.findAll ();
    }
}
