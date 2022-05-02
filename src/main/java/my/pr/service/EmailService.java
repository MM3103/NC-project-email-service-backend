package my.pr.service;

import my.pr.email.Email;
import my.pr.email.Sender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.UUID;

@Service
public class EmailService {
    public void emailMessage(UUID id, String name) throws MessagingException {
        Sender sender = new Sender("homework0005@gmail.com", "homework1234");
        Email email = new Email("homework0005@gmail.com");
        email.setTitle("New order created");
        email.setContent(String.format("User name: " + name
                + ", order id " + id.toString() +
                ".If you want to accept order,click here: http://localhost:3000/accept/"
                + id));
        sender.sendMessage(email);
    }

}
