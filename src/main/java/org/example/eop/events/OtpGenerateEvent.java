package org.example.eop.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.eop.entity.Users;

@Getter
@RequiredArgsConstructor
public final class OtpGenerateEvent {
    private final Users users;
}