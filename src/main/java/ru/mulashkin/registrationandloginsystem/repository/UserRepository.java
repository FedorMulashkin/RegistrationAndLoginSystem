package ru.mulashkin.registrationandloginsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mulashkin.registrationandloginsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
