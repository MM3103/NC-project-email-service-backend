package my.pr.controller;

import io.swagger.v3.oas.annotations.Operation;
import my.pr.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
public class EmailController {
    @Autowired
    EmailService service;

    @GetMapping("/{id}/{name}")
    @Operation(summary = "Email message")
    public void emailMessage(@PathVariable(value = "id") UUID id, @PathVariable(value = "name") String name) throws MessagingException {
        service.emailMessage(id, name);
    }

}
