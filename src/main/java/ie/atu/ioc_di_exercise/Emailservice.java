package ie.atu.ioc_di_exercise;

import org.springframework.stereotype.Service;

@Service
public class Emailservice {

    public String sendEmail(String To, String message)
    {
        return message;
    }
}
