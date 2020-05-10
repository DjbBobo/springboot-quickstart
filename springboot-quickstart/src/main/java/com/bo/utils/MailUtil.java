package com.bo.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MailUtil {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Value("${spring.mail.username}")
    private String originMail;


    public void sendEmail(String email,String code) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("测试");
        mailMessage.setText("验证码:"+code);
        mailMessage.setFrom(originMail); // 发件人
        mailMessage.setTo(email); //收件人
        mailSender.send(mailMessage);
        log.info("成功发送邮件");
    }
}
