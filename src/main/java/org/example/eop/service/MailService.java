package org.example.eop.service;

import java.util.Map;

public interface MailService {
    void sendVerificationMail(Map<Object, Object> model);

    boolean turnOnOffSMTPServer();

    boolean isSMTPActive();

}