package com.bardiademon.SpringProject;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ConfSecurity extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure (HttpSecurity http) throws Exception
    {
        http.csrf ().disable ()
                .authorizeRequests ().antMatchers ("/users/**" , "/posts/**")
                .permitAll ().anyRequest ().authenticated ();
    }
}
