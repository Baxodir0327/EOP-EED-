package org.example.eop.service;

import org.example.eop.dto.UserCreateDto;
import org.example.eop.entity.Users;

public interface UsersService {
    Users create(UserCreateDto dto);
}