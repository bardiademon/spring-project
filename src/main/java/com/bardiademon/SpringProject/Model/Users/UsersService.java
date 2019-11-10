package com.bardiademon.SpringProject.Model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService
{

    public final UsersRepository Repository;

    @Autowired
    public UsersService (UsersRepository Repository)
    {
        this.Repository = Repository;
    }

}
