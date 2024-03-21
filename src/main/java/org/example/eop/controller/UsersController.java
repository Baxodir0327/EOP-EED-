package org.example.eop.controller;

import lombok.RequiredArgsConstructor;
import org.example.eop.dto.UserCreateDto;
import org.example.eop.entity.Users;
import org.example.eop.service.CacheService;
import org.example.eop.service.MailService;
import org.example.eop.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;
    private final MailService mailService;
    private final CacheService cacheService;


    @PostMapping
    public ResponseEntity<Users> create(@RequestBody UserCreateDto dto) {
        return ResponseEntity.status(201).body(usersService.create(dto));
    }

    @PostMapping("/smtp/on-off")
    public ResponseEntity<Boolean> turnOnOffSMTPServer() {
        return ResponseEntity.ok(mailService.turnOnOffSMTPServer());
    }
    @GetMapping
    public ResponseEntity<ConcurrentHashMap<Object, Map<Object,Object>>> getCache() {
        return ResponseEntity.ok(cacheService.getCache());
    }


}
