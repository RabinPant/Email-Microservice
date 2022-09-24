package com.rabin.Controller;

import com.rabin.DTO.EmailRequest;
import com.rabin.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController

public class NotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendTextEmail(@RequestBody EmailRequest request) {
        return emailService.sendSimpleEmail(request);
    }
    @PostMapping("/sendAttachment")
    public String sendTextEmailWithAttachment(@RequestBody EmailRequest request) throws MessagingException {
        System.out.println(request.getAttachement());
        return emailService.sendEmailWithAttachement(request);
    }
}
