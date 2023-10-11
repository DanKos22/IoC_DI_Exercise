package ie.atu.ioc_di_exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private final Userservice us;

    @Autowired
    public UserController(Userservice us)
    {
        this.us = us;
    }
    @GetMapping( "registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email)
    {
        return us.registerUser(name, email);
    }
}
