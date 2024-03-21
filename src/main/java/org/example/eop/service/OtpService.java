package org.example.eop.service;

import org.example.eop.entity.Users;

public interface OtpService {
    void generateOtp(Users user);
}