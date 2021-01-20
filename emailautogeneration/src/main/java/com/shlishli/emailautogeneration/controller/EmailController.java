package com.shlishli.emailautogeneration.controller;

import com.shlishli.emailautogeneration.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendEmail")
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping(value = "/send/{receiver}/{content}")
    public String sendEmail(@PathVariable("receiver") String receiver, @PathVariable("content") String content){


        sendEmailService.sendEmail(receiver, content, "Order Summary");
        return "Email Sent Successfully";
    }
}
