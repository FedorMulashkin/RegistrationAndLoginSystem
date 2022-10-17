package ru.mulashkin.registrationandloginsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mulashkin.registrationandloginsystem.dto.UserRegistrationDto;
import ru.mulashkin.registrationandloginsystem.entity.Role;
import ru.mulashkin.registrationandloginsystem.entity.User;
import ru.mulashkin.registrationandloginsystem.repository.UserRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                List.of(new Role("ROLE_USER"))
        );
        return userRepository.save(user);
    }
}
