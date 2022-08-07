package co.develhope.Angelo.Notification.mail.Example.email.services;

import co.develhope.Angelo.Notification.mail.Example.users.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendTo(String email, String title, String text) {

        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(email);
        sms.setSubject(title);
        sms.setFrom("development@develhope.co");
        //sms.setReplyTo("development@develhope.co");
        sms.setText(text);
        emailSender.send(sms);
    }
}
