package org.example.eop.mapper;

import javax.annotation.processing.Generated;
import org.example.eop.dto.UserCreateDto;
import org.example.eop.entity.Users;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-21T17:29:40+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (JetBrains s.r.o.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Users fromCreateDto(UserCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        Users.UsersBuilder users = Users.builder();

        users.email( dto.getEmail() );
        users.username( dto.getUsername() );
        users.password( dto.getPassword() );

        return users.build();
    }
}
