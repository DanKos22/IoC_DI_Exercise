package ie.atu.ioc_di_exercise;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class Userservice {

    private final Emailservice emailservice;

    @Autowired
    public Userservice(Emailservice emailservice)
    {
        this.emailservice = emailservice;
    }

    // Method for 1st exercise
    public String registerUser(String name, String email)
    {
        String message = emailservice.sendEmail(email,"Welcome to our platform\t" + name + "\t" + email);
        return message;
    }

    // Method for confirmAndRegister/Part 2 exercise
    public String createMessage(UserDetails user)
    {
        String message = "Welcome to our platform\t" + user.getName() + "\t" + user.getEmail();
        return message;
    }
}
