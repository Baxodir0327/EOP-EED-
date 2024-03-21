package org.example.eop.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.eop.dto.UserCreateDto;
import org.example.eop.entity.Users;
import org.example.eop.events.OtpGenerateEvent;
import org.example.eop.mapper.UserMapper;
import org.example.eop.repository.UsersRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UserMapper userMapper;
    private final UsersRepository usersRepository;
    private final ApplicationEventPublisher publisher;

    @Override
    @Transactional
    public Users create(UserCreateDto dto) {
        Users users = userMapper.fromCreateDto(dto);
        usersRepository.save(users);
        publisher.publishEvent(new OtpGenerateEvent(users));
        return users;
    }
}