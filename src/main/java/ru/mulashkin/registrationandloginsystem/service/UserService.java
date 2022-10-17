package ru.mulashkin.registrationandloginsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.mulashkin.registrationandloginsystem.dto.UserRegistrationDto;
import ru.mulashkin.registrationandloginsystem.entity.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
