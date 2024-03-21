package org.example.eop.mapper;

import org.example.eop.dto.UserCreateDto;
import org.example.eop.entity.Users;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Users fromCreateDto(UserCreateDto dto);
}