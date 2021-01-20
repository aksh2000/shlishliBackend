package com.shlishli.emailautogeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailautogenerationApplication {

//    @Autowired
//    private SendEmailService sendEmailService;
    public static void main(String[] args) {
        SpringApplication.run(EmailautogenerationApplication.class, args);}


//        @EventListener(ApplicationReadyEvent.class)
//        public void triggerWhenStarts (String receiver, String content) {
//            sendEmailService.sendEmail(receiver, content, "Order Summary");
//        }
    }

