package com.ebay.mail.controller;

import com.ebay.mail.dto.MailDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : mail
 * Created date : 2/22/2024
 * Created time : 10:39 AM
 */
@RestController
@RequestMapping("ebay")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;


    @PostMapping("/send/mail")
    public String sendEmail(@RequestBody MailDetailsDto mailDetailsDto){

        try {
            SimpleMailMessage message=new SimpleMailMessage();
            message.setSubject(mailDetailsDto.getSubject());
            message.setTo(mailDetailsDto.getToMail());
            message.setFrom("example@gmail.com");
            message.setText(mailDetailsDto.getMessage());

            javaMailSender.send(message);

            return "Success";
        }catch(Exception e){
            return e.getMessage();
        }


    }
}
