package ie.atu.ioc_di_exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    private final Emailservice emailservice;

    @Autowired
    public Userservice(Emailservice emailservice)
    {
        this.emailservice = emailservice;
    }

    public String registerUser(String name, String email)
    {
        String message = emailservice.sendEmail(email, "Welcome to our platform\t" + name + "\t" + email);
        return message;
    }
}
