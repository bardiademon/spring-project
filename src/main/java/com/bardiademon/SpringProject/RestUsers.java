package com.bardiademon.SpringProject;

import com.bardiademon.SpringProject.Model.Users.Users;
import com.bardiademon.SpringProject.Model.Users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class RestUsers
{

    private final UsersService Service;

    @Autowired
    public RestUsers (UsersService Service)
    {
        this.Service = Service;
    }

    @RequestMapping (value = "/add", method = RequestMethod.POST)
    public Users addNew (@RequestBody Users users)
    {
        return Service.Repository.save (users);
    }

}
