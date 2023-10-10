package ie.atu.ioc_di_exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    private Emailservice emailservice;

    @Autowired
    public Userservice(Emailservice emailservice)
    {
        this.emailservice = emailservice;
    }

    public void registerUser(String name, String email)
    {
        emailservice.sendEmail(email, "Welcome to our platform");
    }
}
