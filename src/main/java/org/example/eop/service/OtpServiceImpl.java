package org.example.eop.service;

import lombok.RequiredArgsConstructor;
import org.example.eop.entity.Users;
import org.example.eop.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OtpServiceImpl implements OtpService {
    private final UsersRepository usersRepository;

    @Override
    public void generateOtp(Users user) {
        user.setOtp(UUID.randomUUID().toString());
        usersRepository.save(user);

    }
}