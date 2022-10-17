package ru.mulashkin.registrationandloginsystem.service;

import ru.mulashkin.registrationandloginsystem.dto.UserRegistrationDto;
import ru.mulashkin.registrationandloginsystem.entity.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
